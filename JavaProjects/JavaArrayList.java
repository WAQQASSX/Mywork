package JavaProjects;
import java.util.ArrayList;

public class JavaArrayList {
        public static void main(String[] args){
            ArrayList<String> cars = new ArrayList<String>(); // it must be wrapper classes , not primitive data types.
            cars.add("coptiva");
            cars.add("ferrari");
            cars.add("bmw");
            cars.add("audi");
            cars.add("procha");
            cars.add("ford");
            cars.set(4, "porsche");
            //cars.clear(); // to delete everything in the array 
            //cars.remove(); // to remove one of the elements 
            System.out.println(cars);
            for(String i : cars){ // for each  loop
                System.out.println(i);
            }
        }
    }
class JavaArrayList2D {
public static void main(String[] args){
    ArrayList<ArrayList<String>> Menu = new ArrayList<>();
    ArrayList<String> TurkisMenu = new ArrayList<>();
    TurkisMenu.add("Adanh kaba");
    TurkisMenu.add("chicken frog");
    TurkisMenu.add("skander");
    ArrayList<String> IraqiMenu= new ArrayList<>();
    IraqiMenu.add("kaba iraqi");
    IraqiMenu.add("dolma");
    IraqiMenu.add("ks lahm");
    IraqiMenu.add("ks djaj");
    ArrayList<String> DrinksMenu = new ArrayList<>();
    DrinksMenu.add("soft drink");
    DrinksMenu.add("juice");
    DrinksMenu.add("chai iraqi");
    DrinksMenu.add("turkish chai");
    DrinksMenu.add("coffee");
    //
    Menu.add(TurkisMenu);
    Menu.add(IraqiMenu);
    Menu.add(DrinksMenu);
    for(ArrayList i: Menu ){
        System.out.println(i);
    }

    // another way to show 
    for (int i=0 ; i <Menu.size();i++){
        for (int k =0 ;k < Menu.get(i).size() ;k++){
            System.out.println(Menu.get(i).get(k));
        }
    }

    }//main close 
}//class close 

    
