package JavaProjects;
import javax.swing.JOptionPane;
public class ATMapp{
public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"Welcome in WS BANK");
    String LorR =  JOptionPane.showInputDialog("Please do you gave account or not (y/n) ");
    if (LorR.equals("y")){
        login.login();

    }else if(LorR.equals("n")){
       JOptionPane.showMessageDialog(null,"Please go to the agency and Create Account  ");

    }else {
        JOptionPane.showMessageDialog(null, "Invalid data ");
    }
    
}
}
class database {
    String User1 = "waqqas";
    String password1 = "123";
    int credit1 = 1000;

}
class login{
static void login(){
    database data = new database();
    String clint = JOptionPane.showInputDialog("Please Enter your UserName ");
    String clintpass = JOptionPane.showInputDialog("Please Enter your Password ");
    if (clint.equals(data.User1) &&  clintpass.equals(data.password1)){
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Please Choice what you want to do 1 :Dopiest 2:Withdraw 3:statement"));
        switch (choice) {
            case 1:
                dopiest.dopiest();

                break;
        
            case 2:
            withdraw.withdraw();

                break;
            case 3 :
                statement.statement();
                break;
            default:
            JOptionPane.showMessageDialog(null, "Invalid data");
        }
 }else {
    JOptionPane.showMessageDialog(null,"fuck off man you don't have an account ");
 }
}


}

class dopiest {
static void dopiest(){
     database data = new database();
    int addMoney = Integer.parseInt(JOptionPane.showInputDialog("How Much Money You want to add ?"));
   data.credit1 += addMoney ; 
    JOptionPane.showMessageDialog(null, "you have this amount of money = " +data.credit1);
     anotPros.anotPros();
}

}
class withdraw{
 static void withdraw(){
    database data = new database();
int submoney = Integer.parseInt(JOptionPane.showInputDialog("How Much Money You want  ?"));
    data.credit1 -= submoney ; 
    JOptionPane.showMessageDialog(null, "Please take you money " );
    JOptionPane.showMessageDialog(null, "you have this amount of money = " + data.credit1);
     anotPros.anotPros();
 }
} 
class statement{     
  static void statement(){
        database data = new database();
        JOptionPane.showMessageDialog(null, " your Credit is : " + data.credit1);
       anotPros.anotPros();
}
}
class anotPros {
    static void anotPros(){
         database data = new database();
        String YorN = JOptionPane.showInputDialog("Do you need anything else  ?? (y/n)");
        if (YorN.equals("y")){
            int choice = Integer.parseInt(JOptionPane.showInputDialog("Please Choice what you want to do 1 :Dopiest 2:Withdraw 3:statement"));
        switch (choice) {
            case 1:
                dopiest.dopiest();

                break;
        
            case 2:
            withdraw.withdraw();


                break;
            case 3 :
                statement.statement();
                break;
        }
        }else if(YorN.equals("n")){
            JOptionPane.showMessageDialog(null, "Thank you Mr/Ms" + data.User1);

        }else{
            JOptionPane.showMessageDialog(null, "Invalid data ");
        }

    }
}