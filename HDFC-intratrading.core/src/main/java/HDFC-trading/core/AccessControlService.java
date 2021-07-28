package HDFC-trading.core;

import org.eclipse.scout.rt.security.AbstractAccessControlService;
import org.eclipse.scout.rt.security.IAccessControlService;
import org.eclipse.scout.rt.security.IPermissionCollection;
import org.eclipse.scout.rt.shared.ISession;
import org.eclipse.scout.rt.shared.session.Sessions;

public class AccessControlService extends AbstractAccessControlService<String> {

  @Override
  protected String getCurrentUserCacheKey() {
    return Sessions.getCurrentUserId();
  }

  @Override
  protected IPermissionCollection execLoadPermissions(String userId) {
    return null;
  }
}
