package JavaProjects;
import java.util.Scanner;
// import javax.swing.JOptionPane;
public class BProject {
public static void main(String[] args) {
    System.out.println("here I make small project to see how much I improved ");
}
    
}
class sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int num1 = input.nextInt();
         System.out.println("Enter number 2 ");
        int num2 = input.nextInt();
        int sum = num1 + num2 ;
        System.out.println(sum);
        input.close();
 }


}
class reversingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the world u want to revers it ");
        String rev = input.nextLine();
       for(int i = rev.length();i>=1;i--){
        System.out.print(rev.charAt(i-1));
       }
       input.close();
    }

}