import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class App02 implements ActionListener{
    private String labelPrefix = "Number of button clicks: ";
    private int numClicks = 0;
    private JLabel label;
    private JFrame fr;
    private JButton button;
    private JPanel panel;
    
    public App02() {
        fr = new JFrame("App02");
        label = new JLabel(labelPrefix + "0 ");
        button = new JButton("I'm Swing Button!");
        panel = new JPanel();
        
        panel.setLayout(new FlowLayout());
        panel.add(button);
        panel.add(label);
        
        
        fr.setLayout(new BorderLayout());
        fr.add(panel);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        
        button.addActionListener(this);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        label.setText(labelPrefix + ++numClicks);
    }
}
