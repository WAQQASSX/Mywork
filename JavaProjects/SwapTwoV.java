package JavaProjects;
/*
here we learn to swap between variables  
 */
public class SwapTwoV{
   public static void main(String[] args) {
    int x = 10, y = 20, temp; // Declare and initialize two
    temp=x;
    x=y;
    y=temp;
    System.out.println(x +" "+ y);
   }
}