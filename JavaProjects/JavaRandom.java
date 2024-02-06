package JavaProjects;
import java.util.Random;
public class JavaRandom {
  public static void main(String[] args) {
    Random random = new Random();
    int num = random.nextInt(10)+1;
    System.out.println(num);
    // another example 
     int waqqasFLang = random.nextInt(5);
     String[] langs = {"go","python","java","js","bash"};
     System.out.println("I can make programs by " +langs[waqqasFLang]);
  }
    
    }