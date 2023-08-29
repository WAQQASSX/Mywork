package JavaProjects;
/**
 * 2dArraylist
 */
import java.util.ArrayList;
public class t2dArraylist {
public static void main(String[] args) {
    ArrayList<String> Sportcars = new ArrayList();
    Sportcars.add("mustang");
    Sportcars.add("Focus sr");
    Sportcars.add("Edge");
    Sportcars.add("Ford GT");
    ArrayList<String> Trucks = new ArrayList();
    Trucks.add("F150");
    Trucks.add("Raptar");
    Trucks.add("Mavrick");
    ArrayList<ArrayList<String>> ford = new ArrayList();
    ford.add(Trucks);
    ford.add(Sportcars);
    System.out.println(ford.get(1));

}
    
}