package JavaProjects;
import java.util.Scanner;
// normal if statement
public class ifstatmentlesson {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("how old are you ?");
    int age = input.nextInt() ; 
    if(age >=  18 ){
        System.out.println("you have access");

    }else {
        System.out.println("you don't have  permission to join ");
    }
    input.close();
}
    
}
// if statement with Strings 
class if_statmentlesson2 {
    public static void main(String[] args) {
        Scanner StdInput = new Scanner(System.in);
        System.out.println("please enter ur email");
        String email = StdInput.nextLine();
        System.out.println("please enter ur password");
        String password = StdInput.nextLine();
        if(email.equals("test@gmail.com") && password.equals("123") ){
            System.out.println("you have access");
    
        }else {
            System.out.println("you don't have  permission to join ");
        }
        StdInput.close();
}
}
// short form 

class ifstatmentlessonshortform {
public static void main(String[] args) {
    Scanner iput =  new Scanner(System.in);
    System.out.println("how old are you?");
    int age1 = iput.nextInt() ; 
    String age = (age1 >= 18) ? "you have access" : "you don't have permission to join";
    System.out.println(age);
    
    iput.close();
}
    
}
/**
 * test
 */
 class ifstatmentlessontest {
    public static void main(String[] args) {
        int age = 18;
        age *= 9 ; 
        System.out.println(age);
    }
    
}