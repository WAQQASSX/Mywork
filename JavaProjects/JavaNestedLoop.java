package JavaProjects;
import java.util.Scanner;

public class JavaNestedLoop {
    public static void main(String[] args) {
        // Nested loop example 1: outer loop is for rows and inner loop is for columns
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter how many rows do you want ");
        int rows = input.nextInt()  ; 
        System.out.println("Enter how many columns do you want ");
        int columns = input.nextInt() ; 
        System.out.println("Choose any sympol you want");
        String sympol = input.next(); 

        for (int i=1 ; i<=rows;i++){
            System.out.println();
            for (int j=1 ; j<= columns;j++){
                System.out.print(sympol);
            }
        }
    }
}
