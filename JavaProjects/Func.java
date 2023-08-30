package JavaProjects;
import java.util.Scanner;
public class Func{

static void Calc(){
    boolean n =  true ; 
    Scanner input = new Scanner(System.in);
    while(n){
System.out.println("Please enter the first number ");
int num1 = input.nextInt();
input.nextLine();
System.out.println("Please enter the operator you want to use ( * , - , + , / , %) ");
String op = input.nextLine();
System.out.println("Please enter the 2nd number ");
int num2 =input.nextInt();

if(op.equals("+")){
   int s = num1 + num2 ;
    System.out.println(s);

}else if(op.equals("-")){
    int s = num1 - num2 ; 
    System.out.println(s);
}else if (op.equals("*")){
    int s = num1 * num2 ;
    System.out.println(s);
}else if(op.equals("/")){
    int s = num1 / num2 ;
    System.out.println(s);
}
else if(op.equals("%")){
    int s = num1 % num2 ;
    System.out.println(s);
}

System.out.println("do you want another  proses ? (y/n)");
input.nextLine();
String yn = input.nextLine();
if (yn.equals("y")){
    continue;
}else if(yn.equals("n")){
    break;
}else{
    System.err.println("Invalid data ");
    break;
}
}
input.close();
}
public static void main(String[] args) {
    Calc();
 
}
}

