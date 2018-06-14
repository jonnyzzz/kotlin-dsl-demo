package corp.jpa;

public class DBConnectionUtil {
  //TODO: use component container, not static!
  private static final DBConnectionFactory factory = new DBConnectionFactory();

  public static <Y> Y runWithConnection(ConnectionAction<Y> a) {
    final DBConnection c = factory.newConnection();
    try {
      return a.runWithConnection(c);
    } finally {
      factory.returnConnection(c);
    }
  }
}

