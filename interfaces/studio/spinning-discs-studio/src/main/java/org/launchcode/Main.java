package org.launchcode;

public class Main {
    public static void main(String[] args) {

        //--breakpoint 1--//
        //--constructor calls w/ required parameters--//
        BaseDisc CD = new CD ("Dream Theater", "music");
        BaseDisc DVD = new DVD("The Fellowship of the Ring", "movie");

        //--breakpoint 2--//
        //--behaviors--//
        ((CD) cd).spinDisc();
        cd.storeData();
        cd.writeData();
        ((CD) cd).readData();

        //--breakpoint 3--//
        //--some additional behaviors--//

        ((DVD) dvd).spinDisc();
        dvd.storeData();
        dvd.writeData();
        ((DVD) dvd).spinDisc();

        //--throw error--//
        try {
            throw new Error("Bad.");
        } catch(Error e){
            e.printStackTrace();
        }

        System.out.println((DVD) dvd).destroyMicrowave());
    }
}