package JavaProjects;
import java.util.Random;
import javax.swing.JOptionPane;
public class GuessGame{
    public static void main(String[] args) {
        RandNumber();
    }
    static void RandNumber(){
    Random n = new Random();
    while(true){
    int rn = n.nextInt(10)+1;
    JOptionPane.showMessageDialog(null,"Please Guess The Number from 1 to 10 ");
    int Gnum = Integer.parseInt(JOptionPane.showInputDialog("Please Guess the number "));
    while(true){
    if(Gnum == rn ){
        JOptionPane.showMessageDialog(null, " win ");
        break;
    }else if(Gnum > rn){
        JOptionPane.showMessageDialog(null,"lower ");
        Gnum = Integer.parseInt(JOptionPane.showInputDialog("Please Guess the number "));
        continue;
    }else if(Gnum < rn ){
            JOptionPane.showMessageDialog(null,"higher ");
            Gnum = Integer.parseInt(JOptionPane.showInputDialog("Please Guess the number "));
            continue;
    }
        }
    String yorN = JOptionPane.showInputDialog(" Do you want play again (y/n)?");
    if(yorN.equals("y")){
        continue;
    }else if (yorN.equals("n")){
        break;
    } else {
        JOptionPane.showMessageDialog(null, "Invalid data");
        break;
    }
}
}
}