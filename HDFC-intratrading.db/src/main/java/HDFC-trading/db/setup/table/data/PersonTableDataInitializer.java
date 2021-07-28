package HDFC-trading.db.setup.table.data;

import java.util.UUID;

import org.jooq.DSLContext;

import HDFC-trading.persistence.tables.records.PersonRecord;

public class PersonTableDataInitializer implements IDataInitializer {

  public static final String ID_ALICE = UUID.randomUUID().toString();
  public static final String ID_BOB = UUID.randomUUID().toString();

  @Override
  public void initialize(DSLContext context) {
  }

  @Override
  public void addSamples(DSLContext context) {
    context.executeInsert(new PersonRecord(ID_ALICE, "Alice", "Miller", 4000, true));
    context.executeInsert(new PersonRecord(ID_BOB, "Bob", "Smith", 3000, false));
  }
}
