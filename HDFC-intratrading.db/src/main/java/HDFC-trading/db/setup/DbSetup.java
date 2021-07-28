package HDFC-trading.db.setup;

import java.util.Set;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.config.CONFIG;
import org.jooq.DSLContext;

import HDFC-trading.db.Environment;
import HDFC-trading.db.helper.DatabaseHelper;
import HDFC-trading.db.setup.schema.IDatabaseSchema;
import HDFC-trading.db.setup.table.IGenerateTable;
import HDFC-trading.db.setup.table.data.IDataInitializer;
import HDFC-trading.persistence.PersistenceProperties.DatabaseAddSamplesProperty;

public class DbSetup {

  public static void main(String[] args) {
    new Environment().runWithConfig(new DbSetup()::setup);
  }

  public void setup(DSLContext context) {
    createDatabase(context);
    insertData(context);
  }

  private void createDatabase(DSLContext context) {
    createSchemas(context);
    createTables(context);
  }

  private void createTables(DSLContext context) {
    Set<String> tables = BEANS.get(DatabaseHelper.class).getTableNames(context);
    for (IGenerateTable table : BEANS.all(IGenerateTable.class)) {
      executeCreateSQL(context, tables, table);
    }
  }

  private void createSchemas(DSLContext context) {
    Set<String> schemas = BEANS.get(DatabaseHelper.class).getSchemaNames(context);
    for (IDatabaseSchema schema : BEANS.all(IDatabaseSchema.class)) {
      executeCreateSQL(context, schemas, schema);
    }
  }

  private void executeCreateSQL(DSLContext context, Set<String> databaseObjects, IDatabaseObject databaseObjectToGenerate) {
    if (databaseObjects.contains(databaseObjectToGenerate.getName())) {
      return; // already exists
    }

    databaseObjectToGenerate.setContext(context);
    context.execute(databaseObjectToGenerate.getCreateSQL());
  }

  private void insertData(DSLContext context) {
    for (IDataInitializer table : BEANS.all(IDataInitializer.class)) {
      // insert initial data (minimal data, required to run the application)
      table.initialize(context);

      // insert sample data (for development / demo)
      if (CONFIG.getPropertyValue(DatabaseAddSamplesProperty.class)) {
        table.addSamples(context);
      }
    }
  }
}
