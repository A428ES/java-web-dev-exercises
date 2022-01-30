package exercises.class7;

public class Laptop extends Computer {
    private boolean lidStatus;

    public Laptop(int ram, int space){
        super(ram, space);

        lidStatus = true;
    }

    public boolean getStatus(){
        return lidStatus;
    }

    public void changeLidStatus(){
        if(lidStatus == true){
            lidStatus = false;
        } else {
            lidStatus = true;
        }
    }
}
