package exercises.class7;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {
    private static ArrayList<Integer> idList = new ArrayList<>();
    private int generatedID;

    public AbstractEntity() {
        int idWork = -1;

        do{
            idWork = ThreadLocalRandom.current().nextInt(0, 100 + 1);

            if (idList.indexOf(idWork) == -1) {
                this.idList.add(idWork);
                generatedID = idWork;
            }
        } while(idWork == -1);
    }

    public int getUniqueID(){
        return generatedID;
    }
}
