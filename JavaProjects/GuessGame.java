package JavaProjects;
import java.util.Random; import javax.swing.JOptionPane;

public class GuessGame {
public static void main(String[] args ){
    Greeting();
    Game();
}
static void Greeting(){
JOptionPane.showMessageDialog(null, "Welcome in the Guessing Game !", null, 1);
JOptionPane.showMessageDialog(null, "The game about using the guessing number from 0 to 10. ", null, 1);
}
public static void Game(){
    Random random = new Random();
    int computer = random.nextInt(10)+1;
    int Player = Integer.parseInt(JOptionPane.showInputDialog("you must chose a number from 0 to 10 "));
while (true) { 
    if(computer == Player){
        JOptionPane.showMessageDialog(null, "Congregations you win :)", null, 1);
        break;
    }else if(computer < Player){
        JOptionPane.showMessageDialog(null,"Your number is high \n Try again ");
        Player = Integer.parseInt(JOptionPane.showInputDialog("Chose a number from 0 to 10 "));
    }else if(computer>Player){
        JOptionPane.showMessageDialog(null,"Your number is low \n Try again ");
        Player = Integer.parseInt(JOptionPane.showInputDialog("Chose a number from 0 to 10 "));
    }
}
}
}