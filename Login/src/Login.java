import java.awt.*;
import javax.swing.*;
public class Login{
    private JFrame fr;
    private JDesktopPane dp;
    private JInternalFrame ifr;
    private JLabel lbl;
    private JTextField user;
    private JButton btn;
    private ImageIcon img;
    private JPasswordField pass;
    
    public Login() {
        fr = new JFrame("Libearch");
        dp = new JDesktopPane();
        ifr = new JInternalFrame("Login");
        img = new ImageIcon("Login2.png");
        lbl = new JLabel(img);
        user = new JTextField();
        pass = new JPasswordField();
        btn = new JButton();
        
        //set internal frame
        ifr.add(lbl);
        //lbl.setIcon(img);
        ifr.pack();
        
        ifr.setSize(800, 450);
        Dimension desktopSize = dp.getSize();
        Dimension jInternalfrSize = ifr.getSize();
        ifr.setLocation((desktopSize.width-jInternalfrSize.width)/2, (desktopSize.height-jInternalfrSize.height)/2);
        
        ifr.setVisible(true);
        
        dp.add(ifr);
        fr.add(dp);
        fr.setSize(1600, 900);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
