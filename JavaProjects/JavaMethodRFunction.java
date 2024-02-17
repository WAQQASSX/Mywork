package JavaProjects;
import javax.swing.JOptionPane;

public class JavaMethodRFunction {
    public static void main(String[] args) {
    //    String name = JOptionPane.showInputDialog("what's ur name ?");
    //    greeting(name);
    while  (true){
    int option = Integer.parseInt(JOptionPane.showInputDialog("Chose what you want to do 1 add , 2 subtract , 3 multiply , 4 deviation , 5 power "));
             int x = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
             int y = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));    
    switch (option) {
                case 1:
                JOptionPane.showMessageDialog(null, add(x,y)) ;
                break;
                case 2:
                JOptionPane.showMessageDialog(null, sub(x,y)) ;
                break;
                case 3:
                JOptionPane.showMessageDialog(null, mult(x,y)) ;
                break;
                case 4:
                JOptionPane.showMessageDialog(null, div(x,y)) ;
                break;
                case 5:
                JOptionPane.showMessageDialog(null, power(x,y)) ;
                break;
                // case 6:
                // JOptionPane.showMessageDialog(null, Bexpo(x,y)) ;
                // break;


            
        }
        String cont = JOptionPane.showInputDialog("Do u want to continue y/n?");
        if(cont.equals("n")){
        break;
        }
    }
}
    //first type of function 
    // greeting statement 
    static void greeting(String name ){
    JOptionPane.showMessageDialog(null,"Hello Mr."+name);
    }


    // basic calc
    static int add(int x ,int  y){

        return x + y;
    }
    static int sub(int x ,int  y){

        return x - y;
    }
    static double power(int x ,int  y){
        double z = Math.pow(x,y);
        return z; 
    }
    static int mult(int x ,int  y){

        return x * y;
    }
    static int div(int x ,int  y){
     return x /y;
    }
    // find the big expo 
    // static double Bexpo(double x, double y ){
    //     for(double i = 0; i<=y;i++ ){
    //         x *=x ;
    //         System.out.println(x);

    //     } 
    //     return x;
    // }
     
    
    
}


class JavaOverLoadMethod{
    public static void main(String[] args){
        System.out.println(add(4,5));
        System.out.println(add(9,3,7));
    }
    //calc 
    static int add(int x , int y){

        return x+y ;
    }

    static int add(int x , int y , int z){

        return x+y+z;
    }
}