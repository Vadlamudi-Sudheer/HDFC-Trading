package HDFC-trading.db.setup.schema;

import HDFC-trading.db.setup.AbstractDatabaseObject;

public abstract class AbstractSchema extends AbstractDatabaseObject implements IDatabaseSchema {

  @Override
  public void create() {
    getLogger().info("SQL-DEV create schema: {}", getName());
    super.create();
  }

  @Override
  public void drop() {
    getContext()
        .dropSchemaIfExists(getName())
        .execute();
  }
}
