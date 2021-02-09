package org.launchcode.studio7;

public class DVD extends BaseDisc {

  private final static String STORAGE_SPACE = "4.7GB";

  public DVD(String title) {
    super(title);
  }

  // TODO: Implement your custom interface.
    @Override
    public void spin() {
      System.out.println("Spinning at 200 - 500 rpm");
    }

  @Override
  public void reading() {
    System.out.println("Reading data on dvd");
  }

  @Override
  public void writing() {
    System.out.println("Writing data to dvd");
  }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
