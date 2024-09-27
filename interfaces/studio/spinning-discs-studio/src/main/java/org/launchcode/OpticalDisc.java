package org.launchcode;

public interface OpticalDisc {
    void spinDisc();

    default String destroyMicrowave(){
        return "Disc is now destroyed!";
    }

    void readData();
}