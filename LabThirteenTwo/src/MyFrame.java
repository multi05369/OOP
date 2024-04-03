
import java.awt.*;
import javax.swing.*;
public class MyFrame {
    public static void main(String[] args) {
        JFrame fr = new JFrame("TimeThai");
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
        fr.add(clock);
        fr.setSize(220, 100);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
