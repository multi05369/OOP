import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JPanel p2;
    private JTextField txt;
    private JTextField txt2;
    private JTextField answer;
    
    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        p = new JPanel();
        p2 = new JPanel();
        txt = new JTextField();
        txt2 = new JTextField();
        answer = new JTextField();
        
        p.setLayout(new GridLayout(4, 0));
        p.add(txt);
        p2.setLayout(new FlowLayout());
        p2.add(new JButton("Plus"));
        p2.add(new JButton("Minus"));
        p2.add(new JButton("Times"));
        p2.add(new JButton("Divide"));
        p.add(txt2);
        p.add(p2);
        p.add(answer);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
