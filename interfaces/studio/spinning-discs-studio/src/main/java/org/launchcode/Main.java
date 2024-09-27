package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        BaseDisc CD = new CD ("Dream Theater", "music");
        BaseDisc DVD = new DVD("The Fellowship of the Ring", "movie");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        ((CD) cd).spinDisc();
        cd.storeData();
        cd.writeData();
        ((CD) cd).readData();

        ((DVD) dvd).spinDisc();
        dvd.storeData();
        dvd.writeData();
        ((DVD) dvd).spinDisc();

        System.out.println((DVD) dvd).destroyMicrowave());
    }
}