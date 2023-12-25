package JavaProjects;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Time {
public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime d  = LocalDateTime.now();
    JOptionPane.showMessageDialog(null,  d.now().getDayOfMonth()+" "+  d.now().getMonth()  + " "+d.now().getYear()+'\n'+ (d.now().getHour()-12)+" : "+ d.now().getMinute(), null, 0);
    // JOptionPane.showMessageDialog(null, date, "Date ", 1);
    // JOptionPane.showMessageDialog(null, time.now().getHour()-12 + " : " + time.now().getMinute(), "Date ", 1);
    System.out.println(date);
}
}