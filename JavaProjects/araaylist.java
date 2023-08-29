package JavaProjects;
import java.util.ArrayList;
public class araaylist {
    public static void main(String[] args) {
        ArrayList<String>  cars = new ArrayList<String>();
        int c = 1 ; 
        cars.add("BMW M5");
        cars.add("MARSAEDES");
        cars.add("toyota subra mk5");
        cars.add("MG");
        cars.add("shanchan");
        cars.add("lotos");
        cars.add("luandcruser");
        for(String i : cars){
            System.err.println(c+" :"+i.toUpperCase());
            c++;
        }
            
        

    
        }
}



