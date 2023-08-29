package JavaProjects;
import java.util.Random;
import java.util.Scanner;

public class casting {
public static void main(String[] args) {
    // how to transform the type of the var 
    float j ; 
    Scanner input = new Scanner(System.in);
    j = input.nextFloat() ; 
    double  n = (double) j; 
    String k =  "" + n;
    System.out.println(n);
    System.out.println(k.length());




    input.close();
}
    
}
class Randoms {
    public static void main(String[] args) {
        Random random = new Random();
        int z ;
        z = random.nextInt(9)+1;
        int[] salary = {1456,250,750,1400,1600,1200,1,5878,700};
        System.out.println(salary[z]);
    }


}

class stringsmed{
    public static void main(String[] args) {
        String x = "waqqas ";
        // boolean d  =  x.equals("waqqas");
        // boolean s = x.equalsIgnoreCase("WAQQAS");
        // int k = x.length();
        // char p = x.charAt(2);
        // int re = x.indexOf("q");
        // boolean a =  x.isEmpty();
        // toUopperCase
        // toLowerCase
        // trim to delete the spaces 
        // String res = x.replace('w', 'k');
        // String res = x.repeat(12);
       

        System.out.println(x);
        F150 car = new F150();
       
    }
}