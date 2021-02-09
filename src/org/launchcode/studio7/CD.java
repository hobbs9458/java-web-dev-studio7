package org.launchcode.studio7;

public class CD extends BaseDisc {

  private final static String STORAGE_SPACE = "700MB";

    // TODO: Implement your custom interface.


  public CD(String title) {
    super(title);
  }

  @Override
  public void spin() {
    System.out.println("Spinning at 570 - 1600 rpm");
  }

  @Override
  public void reading() {
    System.out.println("Reading music on cd");
  }

  @Override
  public void writing() {
    System.out.println("Writing music to cd");
  }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
