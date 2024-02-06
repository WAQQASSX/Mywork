package JavaProjects;
import javax.swing.JOptionPane;
/**
 * condation
 */
public class condation {

  public static void main(String[] args){
    String user = JOptionPane.showInputDialog("please enter the username");
    String password = JOptionPane.showInputDialog("please enter the password");
    
    if(user.equals("waqqas") && password.equals("123")){
      System.out.println("welcome Mr."+user);

     }else{
      System.out.println("go out  you are not allowed here " + user);
     }
  }

}