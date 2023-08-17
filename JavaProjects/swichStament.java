package JavaProjects;
import java.util.Scanner;
public class swichStament {
public static void main(String[] args) {
    
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter 1 for arabic or 2 for english");
    int op= inp.nextInt();
    switch (op) {
         case 1:
            System.out.println("ahalan bk ");
            break;
    
        case 2:
            System.out.println("english");
            break;

    }
}
    
}