package corp.model;

public class JavaClientExample {
  public static void main(String[] args) {
    final JavaClientBuilder builder = new JavaClientBuilder();
    
    builder.setFirstName("Eugene");
    builder.setLastName("Petrenko");

    final JavaTwitterBuilder twitterBuilder = new JavaTwitterBuilder();
    twitterBuilder.setHandle("@jonnyzzz");
    builder.setTwitter(twitterBuilder.build());

    final JavaCompanyBuilder companyBuilder = new JavaCompanyBuilder();
    companyBuilder.setName("JetBrains");
    companyBuilder.setCity("Munich");
    builder.setCompany(companyBuilder.build());


    final JavaClient client = builder.build();
    System.out.println("Created client is: " + client);
  }
}
