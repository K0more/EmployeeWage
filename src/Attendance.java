import java.util.Random;
public class Attendance {
    boolean present;
    Random random = new Random();
    Attendance(){
        if(random.nextBoolean()){
            present = true ;
        }

    }
}