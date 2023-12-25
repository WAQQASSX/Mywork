package JavaProjects;
import javax.swing.JOptionPane;
// import java.util.Scanner;
/**
 * forloopsPrj
 */
public class forloopsPrj {

    public static void main(String[] args) {
        String[] names = {"waqqas","aaidah","hoby","sayed","mary","farah","losie"};
        int i = 1; 
        for(String name : names ){
            System.out.println(i +":"+ name.toUpperCase() );
            i++;       
        }
    }
}


 class whileLoop{
    public static void main(String[] args) {
        int ticket = 1;
        while(ticket <= 10 ){
            JOptionPane.showMessageDialog(null, "Welcome to Riffa Cinema");
            String  name = JOptionPane.showInputDialog("Enter your name");
            System.out.println("Hi Mr/Ms : "+name +"\n"+"you have booked a ticket for Oppenheimer movie, ticket number : "+ticket);
            String yORn = JOptionPane.showInputDialog("do you want another ticket ?? (y/n)");
            if(yORn.equals("y")){
                 ticket++;
            }else if (yORn.equals("n")){
                JOptionPane.showMessageDialog(null, "Thanks you ");
                break;
            }else {
                JOptionPane.showMessageDialog(null, "invilded data ");
            }
        if(ticket == 10 ){
            System.out.println("all the tiket has resaved ");
        }
        
        } 
        
    }

    
}

class doloop {
public static void main(String[] args) {
    String ilv = "I love you bebe" ; 
    int i = 1; 
    do{
        System.out.println(i + ":"+ilv);
        i++;
    }while(i>=10);
}
    
}
class forloop {
public static void main(String[] args) {
    for(int i = 1; i<=10;i++){
        // System.out.println(i+":"+"fuck you");
    }
    String[] girlsname= {"farah","zahraa","mariam","zainab","yesra","aaidah"};
    for(int J = 5; J>=0;J--){
    System.out.println(J + ":" + girlsname[J]);
    }
}
}