package corp.jpa;

public class Example {

  public static void main(String[] args) {

    System.out.println("Starting the application...");

    DBConnectionUtil.runWithConnection(new ConnectionAction<String>() {
      @Override
      public String runWithConnection(DBConnection c) {
        System.out.println("Running the action with connection: " + c);
        return null;
      }
    });

    System.out.println("All set!");
  }
}
