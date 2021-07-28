package HDFC-trading.db.setup.table;

import HDFC-trading.db.setup.IDatabaseObject;

public interface IGenerateTable extends IDatabaseObject {

  String getSchemaName();

  String createSQLInternal();

}
