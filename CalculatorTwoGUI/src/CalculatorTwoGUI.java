import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JTextField txt;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btc, btp, btm, btt, btd, bte;
    
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        txt = new JTextField();
        p1 = new JPanel();
        p2 = new JPanel();
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        bt0 = new JButton("0");
        btc = new JButton("c");
        btp = new JButton("+");
        btm = new JButton("-");
        btt = new JButton("x");
        btd = new JButton("/");
        bte = new JButton("=");
        p3 = new JPanel();
        
        p1.setLayout(new GridLayout());
        p1.add(txt);
        
        p2.setLayout(new GridLayout(4, 4));
        p2.add(bt7);
        p2.add(bt8);
        p2.add(bt9);
        p2.add(btp);
        p2.add(bt4);
        p2.add(bt5);
        p2.add(bt6);
        p2.add(btm);
        p2.add(bt1);
        p2.add(bt2);
        p2.add(bt3);
        p2.add(btt);
        p2.add(bt0);
        p2.add(btc);
        p2.add(bte);
        p2.add(btd);
        
        p3.setLayout(new BorderLayout());
        p3.add(p1, BorderLayout.NORTH);
        p3.add(p2);
        
        fr.add(p3);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
    }
    
}
