package JavaProjects;
import javax.swing.JOptionPane;
public class mathProject {
public static void main(String[] args) {
    int x = 10 ;
    int y = 25;
    double y2= 25;
    double p = -10;
    double n = 5.0;
    int mx = Math.max(x,y);
    int mn = Math.min(y, x);
    double ab = Math.abs(p);
    double pw = Math.pow(p, n);
    double root= Math.sqrt(y2);
    double c = Math.asin(0.8509035245341184);
    double r = Math.round(14.4); // close to 
    double ci = Math.ceil(14.1);// take the bigger number 
    double f = Math.floor(14.9);// take the less number 
    System.out.println();

}
    
}
class mathProject1 {
public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "  اهلا بك في حل فيثاغورث في ثواني ");
    double x = Integer.parseInt(JOptionPane.showInputDialog("ادخل قيمة المقابل"));
    double y = Integer.parseInt(JOptionPane.showInputDialog("ادخل قيمة المجاور "));
    double ans =Math.sqrt( Math.pow(x, 2) + Math.pow(y,2)) ;
    JOptionPane.showMessageDialog(null, ans+"قيمة الوتر هي :");
    
}

}