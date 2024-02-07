
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorSample implements ActionListener {
    private JFrame fr;
    private JTextField txt;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btc, btp, btm, btt, btd, bte;
    
    public CalculatorSample() {
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
        
        //Add ActionListener
        bt0.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bte.addActionListener(this);
        btc.addActionListener(this);
        btp.addActionListener(this);
        btm.addActionListener(this);
        btt.addActionListener(this);
        btd.addActionListener(this);
        
        p3.setLayout(new BorderLayout());
        p3.add(p1, BorderLayout.NORTH);
        p3.add(p2);
        txt.setEditable(false);
        
        fr.add(p3);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    String ans = "";
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt0)) {
            ans += "0";
            if (!"".equals(ans)) {
                txt.setText(ans);
            }
            else {
                txt.setText("0");
            }
        }
        else if (ae.getSource().equals(bt1)) {
            ans += "1";
            if (!"".equals(ans)) {
                txt.setText(ans);
            }
            else {
                txt.setText("1");
            }
        }
        else if (ae.getSource().equals(bt2)) {
            ans += "2";
            if (!"".equals(ans)) {
                txt.setText(ans);
            }
            else {
                txt.setText("2");
            }
        }
        else if (ae.getSource().equals(bt3)) {
            ans += "3";
            if (!"".equals(ans)) {
                txt.setText(ans);
            }
            else {
                txt.setText("3");
            }
        }
        else if (ae.getSource().equals(bt4)) {
            ans += "4";
            if (!"".equals(ans)) {
                txt.setText(ans);
            }
            else {
                txt.setText("4");
            }
        }
        else if (ae.getSource().equals(bt5)) {
            ans += "5";
            if (!"".equals(ans)) {
                txt.setText(ans);
            }
            else {
                txt.setText("5");
            }
        }
        else if (ae.getSource().equals(bt6)) {
            ans += "6";
            if (!"".equals(ans)) {
                txt.setText(ans);
            }
            else {
                txt.setText("6");
            }
        }
        else if (ae.getSource().equals(bt7)) {
            ans += "7";
            if (!"".equals(ans)) {
                txt.setText(ans);
            }
            else {
                txt.setText("7");
            }
        }
        else if (ae.getSource().equals(bt8)) {
            ans += "8";
            if (!"".equals(ans)) {
                txt.setText(ans);
            }
            else {
                txt.setText("8");
            }
        }
        else if (ae.getSource().equals(bt9)) {
            ans += "9";
            if (!"".equals(ans)) {
                txt.setText(ans);
            }
            else {
                txt.setText("9");
            }
        }
        else if (ae.getSource().equals(btc)) {
            txt.setText("");
            ans = "";
        }
        
        if (ae.getSource().equals(btp)) {
            ans += "+";
            txt.setText("");
        }
        else if (ae.getSource().equals(btm)) {
            ans += "-";
            txt.setText("");
        }
        else if (ae.getSource().equals(btt)) {
            ans += "*";
            txt.setText("");
        }
        else if (ae.getSource().equals(btd)) {
            ans += "/";
            txt.setText("");
        }
        
        int res = 0;
        if (ae.getSource().equals(bte)) {
            if (ans.contains("+")) {
                String[] parts = ans.split("\\+");
                for (String part: parts) {
                    int num = Integer.parseInt(part);
                    res += num;
                }
                txt.setText(String.valueOf(res));
            }
            else if (ans.contains("-")) {
                String[] parts = ans.split("\\-");
                res = Integer.parseInt(parts[0]);
                for (int i = 1; i < parts.length; i++) {
                    int num = Integer.parseInt(parts[i]);
                    res -= num;
                }
                txt.setText(String.valueOf(res));
            }
            else if (ans.contains("*")) {
                String[] parts = ans.split("\\*");
                res = Integer.parseInt(parts[0]);
                for (int i = 1; i < parts.length; i++) {
                    int num = Integer.parseInt(parts[i]);
                    res *= num;
                }
                txt.setText(String.valueOf(res));
            }
            else if (ans.contains("/")) {
                String[] parts = ans.split("\\/");
                res = Integer.parseInt(parts[0]);
                for (int i = 1; i < parts.length; i++) {
                    int num = Integer.parseInt(parts[i]);
                    res /= num;
                }
                txt.setText(String.valueOf(res));
            }
        }
        
    }
}


