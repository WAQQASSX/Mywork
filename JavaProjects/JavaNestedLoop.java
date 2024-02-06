package JavaProjects;
import java.util.Scanner;

public class JavaNestedLoop {
    public static void main(String[] args) {
        // Nested loop example 1: outer loop is for rows and inner loop is for columns
        Scanner input  = new Scanner(System.in);
        // System.out.println("Enter how many rows do you want ");
        // int rows = input.nextInt()  ; 
        // System.out.println("Enter how many columns do you want ");
        // int columns = input.nextInt() ; 
        // System.out.println("Choose any sympol you want");
        // String sympol = input.next(); 

        // for (int i=1 ; i<=rows;i++){
        //     System.out.println();
        //     for (int j=1 ; j<= columns;j++){
        //         System.out.print(sympol);
        //     }
        // }

        // a little Project 
        System.out.println("how many rows do want ?");
        int rows = input.nextInt();

       for (int i=1;i<=rows;i++){
        for(int j=1; j<=i;j++){
        System.out.print("*");
       }
       System.out.println();
       }

       for(int i=rows-1;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       input.close();

}
    }
