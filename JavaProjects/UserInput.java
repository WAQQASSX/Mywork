package JavaProjects;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        // to make input firstly we need to import the sacanner 
        Scanner input = new Scanner(System.in);
        System.out.println("how old are you ?");
        int age = input.nextInt();
        System.out.println("what's ur name ?");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("are you bahraini");
        boolean isBahrainian = input.nextBoolean();
        System.out.println("ur name is "+ name + " ur age is "+age + " Bahraini (T or F):"+ isBahrainian);
        input.close();
    }
}
