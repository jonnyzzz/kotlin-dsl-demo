package corp.jpa;

public interface ConnectionAction<Y> {
  Y runWithConnection(DBConnection c);
}
