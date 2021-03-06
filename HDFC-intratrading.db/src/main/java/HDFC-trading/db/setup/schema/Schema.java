package HDFC-trading.db.setup.schema;

import org.eclipse.scout.rt.platform.config.CONFIG;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import HDFC-trading.persistence.PersistenceProperties.SchemaProperty;

public class Schema extends AbstractSchema {

  @Override
  public String getName() {
    return CONFIG.getPropertyValue(SchemaProperty.class);
  }

  @Override
  public Logger getLogger() {
    return LoggerFactory.getLogger(Schema.class);
  }
}
