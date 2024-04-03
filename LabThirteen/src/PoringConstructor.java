import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class PoringConstructor implements ActionListener{
    private JFrame fr;
    private JButton btn;
    private ArrayList<Poring> poring;
    
    public PoringConstructor() {
        fr = new JFrame("Constructor");
        btn = new JButton("Add");
        poring = new ArrayList<>();
        btn.addActionListener(this);
        
        fr.setLayout(new FlowLayout());
        fr.add(btn);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        poring.add(new Poring(poring.size() + 1));
    }
}
