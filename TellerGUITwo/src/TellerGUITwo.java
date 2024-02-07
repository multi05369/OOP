import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TellerGUITwo implements ActionListener{
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JButton bt1, bt2, bt3;
    private JTextField txt;
    private JLabel lbl1, lbl2;
    private JTextField lbl3;
    private int balance = 6000;
    
    public TellerGUITwo() {
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
        lbl3 = new JTextField("" + balance);
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
        
        //Set ActionListener
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        
        fr.add(p4);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt3)) {
            System.exit(0);
        }
        else if (ae.getSource().equals(bt1)) {
            balance += Integer.parseInt(txt.getText());
            lbl3.setText("" + balance);
            txt.setText("");
        }
        else if (ae.getSource().equals(bt2)) {
            if (balance < Integer.parseInt(txt.getText())) {
                lbl3.setText("" + balance);
            }
            else {
                balance -= Integer.parseInt(txt.getText());
                lbl3.setText("" + balance);
                txt.setText("");
            }
        }
    }
    
}
