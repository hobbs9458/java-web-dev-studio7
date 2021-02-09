package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Ok Computer");
        DVD myDVD = new DVD("Django");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.startPlaying();
        myDVD.startPlaying();

        myCD.reading();
        myCD.writing();
        myCD.spin();

        myDVD.reading();
        myDVD.writing();
        myDVD.spin();

    }
}
