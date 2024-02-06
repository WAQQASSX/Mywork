package JavaProjects;
import javax.swing.JOptionPane;
public class JavaSwitches {
    public static void main(String[] args) {
      String  choice = JOptionPane.showInputDialog("choose easy , normal , hard");
      switch (choice) {
        case "easy": 
          System.out.println("you choose easy level");
            break;
        case "normal":  
          System.out.println("you choose normal level");
          break;
        case "hard":
        System.out.println("you choose hard level");
        break;    
      }
    }
    
}
