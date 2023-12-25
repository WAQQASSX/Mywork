package JavaProjects;
import java.util.Scanner;
public class lesson2 {

public static void main(String[] args) {
    Scanner Myinput = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String name = Myinput.nextLine();
    System.out.println("Hello " + name);
    Myinput.close();
} 
}
    
class trys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    try {
        System.out.println("Enter your age  : ");
        int age = input.nextInt();
        System.out.println("ur age is  :" + age );
    }catch(Exception erorr ){
        System.out.println("try again");
        System.out.println("Enter your name :");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("ur name is :"+name);
    }
    System.out.println("bye");
    }

}