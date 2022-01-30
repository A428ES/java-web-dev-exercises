package exercises.class7;

import java.util.ArrayList;

public class Computer extends AbstractEntity {
    private int totalRam;
    private int totalStorage;
    private boolean networkConnected = false;
    private int deviceID;

    public Computer(int ram, int storage){
        totalRam = ram;
        totalStorage = storage;

        this.deviceID = this.getUniqueID();
    }

    public int getId(){
        return this.deviceID;
    }

    public boolean getNetwork(){
        return networkConnected;
    }

    public int getRam(){
        return totalRam;
    }

    public int getStorage(){
        return totalStorage;
    }

    public void setNetwork(boolean connected){
        networkConnected = connected;
    }

    public void setRam(int ram){
        totalRam = ram;
    }

    public void setSpace(int space){
        totalStorage = space;
    }
}
