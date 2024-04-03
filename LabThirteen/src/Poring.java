import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import static java.lang.System.getProperty;
public class Poring implements MouseListener, Runnable{
    private JFrame fr;
    private JLabel lbl, lblcount;
    private ImageIcon image;
    private File file;
    private Thread t1;
    
    public Poring(int count) {
        fr = new JFrame("PoPo");
        lbl = new JLabel();
        String userpath = System.getProperty("user.home");
        String imagepath = userpath + "\\Desktop\\OOP\\LabThirteen\\poring.png";
        file = new File(imagepath);
        lblcount = new JLabel(String.valueOf(count));
        if (file.exists()) {
            image = new ImageIcon(imagepath);
            lbl.setIcon(image);
        } else {
            System.out.println("Not found");
        }
        lbl.addMouseListener(this);
        
        fr.setLayout(new FlowLayout());
        fr.add(lbl);
        fr.add(lblcount);
        fr.setSize(200, 150);
        fr.setResizable(false);
        fr.setVisible(true);
        t1 = new Thread(this);
        t1.start();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        fr.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    @Override
    public void run() {
        while (true) {
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            fr.setLocation((int) (Math.random() * (dimension.getWidth() - fr.getWidth())), 
                       (int) (Math.random() * (dimension.getHeight() - fr.getHeight())));
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
