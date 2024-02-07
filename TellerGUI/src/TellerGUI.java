import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JButton bt1, bt2, bt3;
    private JTextField txt;
    private JLabel lbl1, lbl2;
    private JTextField lbl3;
    
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        txt = new JTextField();
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        bt3 = new JButton("Exit");
        lbl1 = new JLabel("Balance");
        lbl2 = new JLabel("Amount");
        lbl3 = new JTextField("6000");
        lbl3.setEditable(false);
        
        p1.setLayout(new GridLayout(1, 2));
        p1.add(lbl1);
        p1.add(lbl3);
        
        p2.setLayout(new GridLayout(1, 2));
        p2.add(lbl2);
        p2.add(txt);
        
        p3.setLayout(new FlowLayout());
        p3.add(bt1);
        p3.add(bt2);
        p3.add(bt3);
        
        p4.setLayout(new BorderLayout());
        p4.add(p1, BorderLayout.NORTH);
        p4.add(p2);
        p4.add(p3, BorderLayout.SOUTH);
        
        fr.add(p4);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
        
    }
    
}
