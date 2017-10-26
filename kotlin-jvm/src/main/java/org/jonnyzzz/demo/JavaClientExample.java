package org.jonnyzzz.demo;

public class JavaClientExample {
  public static void main(String[] args) {
    final JavaClientBuilder builder = new JavaClientBuilder();
    
    builder.setName("Eugene");
    builder.setLastName("Petrenko");
    builder.setTwitter("@jonnyzzz");
    builder.setCompany("JetBrains");

    final JavaClient client = builder.build();

    System.out.println("Created client is: " + client);
  }
}
