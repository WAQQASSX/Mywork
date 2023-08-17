package JavaProjects;
import javax.swing.JOptionPane;
public class GuiProject {
public static void main(String[] args) {
    String data1 = "admin@gmail.com";
    String data2 = "WAQQAS123";
    String email = JOptionPane.showInputDialog("Enter your email address: ");
    String password = JOptionPane.showInputDialog("Enter your password: ");
    if (email.equals(data1) && password.equals(data2)) {
        JOptionPane.showMessageDialog(null, "Login successful");
    } else {
        JOptionPane.showMessageDialog(null, "Login failed");
        JOptionPane.showMessageDialog(null, "register PLEASE ");
    }
     String name = JOptionPane.showInputDialog("Enter your name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String gender = JOptionPane.showInputDialog("Enter your gender (f/m): ");
        String address = JOptionPane.showInputDialog("Enter your Email address: ");
        String password1 = JOptionPane.showInputDialog("Enter your password: ");
        JOptionPane.showMessageDialog(null,name , address, age);
        JOptionPane.showMessageDialog(null,password1);
}
    
}