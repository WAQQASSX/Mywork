package JavaProjects;
import javax.swing.JOptionPane;
public class BiscGUIinJava {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter Your name");
        System.out.printf("Hello mr. %s",name);
        JOptionPane.showMessageDialog(null,"Hello mr." + name);
        // To use intagers in jopationpane , we should casting it using the following 
        int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you;"));
        System.out.println("\nYou Are " +age+ " Years Old.");
        boolean Risdent = Boolean.parseBoolean(JOptionPane.showInputDialog("are you Risdent T or F "));
        System.out.println(Risdent);
    }
    
}
