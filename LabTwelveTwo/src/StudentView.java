import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.io.WriteAbortedException;
public class StudentView implements ActionListener, WindowListener, Serializable{
    private JFrame fr;
    private JLabel lbl1, lbl2, lbl3;
    private JTextField tf1, tf2, tf3;
    private JButton btn1, btn2;
    private JPanel p1, p2, p3, p4, p5;
    private Student taikie;
    
    public StudentView() {
        fr = new JFrame("StudentView");
        lbl1 = new JLabel("ID: ");
        lbl2 = new JLabel("Name: ");
        lbl3 = new JLabel("Money: ");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField("0");
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        
        taikie = new Student();
        
        tf3.setEditable(false);
        p1.setLayout(new GridLayout(3, 1));
        p1.add(lbl1);
        p1.add(lbl2);
        p1.add(lbl3);
        
        p2.setLayout(new GridLayout(3, 1));
        p2.add(tf1);
        p2.add(tf2);
        p2.add(tf3);
        
        p3.setLayout(new FlowLayout());
        p3.add(btn1);
        p3.add(btn2);
        
        p4.setLayout(new GridLayout(1, 2));
        p4.add(p1);
        p4.add(p2);
        
        p5.setLayout(new BorderLayout());
        p5.add(p4, BorderLayout.CENTER);
        p5.add(p3, BorderLayout.SOUTH);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
        fr.add(p5);
        fr.setSize(300, 150);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
        fr.addWindowListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn1)) {
            taikie.setMoney(taikie.getMoney() + 100);
            tf3.setText(String.valueOf(taikie.getMoney()));
        }
        else if (ae.getSource().equals(btn2)) {
            taikie.setMoney(taikie.getMoney() - 100);
            tf3.setText(String.valueOf(taikie.getMoney()));
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
        try (FileInputStream fin = new FileInputStream("StudentM.dat");
             ObjectInputStream oin = new ObjectInputStream(fin);) {
            taikie = (Student) oin.readObject();
            if (taikie == null) {
                taikie = new Student();
                taikie.setID(-1);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        if (taikie.getID() == -1) {
            tf1.setText("");
        } else {
            tf1.setText(String.valueOf(taikie.getID()));
        }
        tf2.setText(taikie.getName());
        tf3.setText(String.valueOf(taikie.getMoney()));
    }
    @Override
    public void windowClosing(WindowEvent e) {
        if (tf1.getText().equals("")) {
            taikie.setID(-1);
        }
        else {
            taikie.setID(Integer.parseInt(tf1.getText()));
        }
        taikie.setName(tf2.getText());
        taikie.setMoney(Integer.parseInt(tf3.getText()));
        try (FileOutputStream fout = new FileOutputStream("StudentM.dat");
             ObjectOutputStream oOut = new ObjectOutputStream(fout);) {
            oOut.writeObject(taikie);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        finally {
            System.out.println("Close Successfuls");
        }
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e){
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}
