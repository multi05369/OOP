import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class App03 implements ActionListener{
    private JFrame fr;
    private JButton b;
    
    public App03() {
        fr = new JFrame("App03");
        b = new JButton("Click Me!");
        
        fr.getContentPane().add(b);
        b.addActionListener(this);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fr.pack();
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        b.setBackground(Color.pink);
    }
    
}
