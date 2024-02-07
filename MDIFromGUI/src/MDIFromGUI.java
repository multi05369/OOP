import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    private JMenuBar menuBar;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi1, mi2, ms2, ms3, ms4;
    
    public MDIFromGUI() {
        fr = new JFrame("SubMenuItm Demo");
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application01", true, true, true, true);
        frame2 = new JInternalFrame("Application02", true, true, true, true);
        frame3 = new JInternalFrame("Application03", true, true, true, true);
        menuBar = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        ms1 = new JMenu("New");
        mi1 = new JMenuItem("Window");
        mi2 = new JMenuItem("Message");
        ms2 = new JMenuItem("Open");
        ms3 = new JMenuItem("Save");
        ms4 = new JMenuItem("Edit");
        
        // Set the MenuBar for Frame and add the menu
        fr.setJMenuBar(menuBar);
        menuBar.add(m1);
        menuBar.add(m2);
        menuBar.add(m3);
        
        m1.add(ms1);
        m1.add(ms2);
        m1.addSeparator();
        m1.add(ms3);
        m1.addSeparator();
        m1.add(ms4);
        
        // add the menuitem for ms1
        ms1.add(mi1);
        ms1.addSeparator();
        ms1.add(mi2);
        
        // create desktopPane and JInternalFrame
        frame1.getContentPane().add(new JLabel(""));
        frame1.setLayout(new BorderLayout());
        frame1.setSize(200, 150);
        frame1.setVisible(true);
        
        frame2.getContentPane().add(new JLabel(""));
        frame2.setLayout(new BorderLayout());
        frame2.setSize(300, 200);
        frame2.setVisible(true);
        
        frame3.getContentPane().add(new JLabel(""));
        frame3.setLayout(new BorderLayout());
        frame3.setSize(250, 175);
        frame3.setVisible(true);
        
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        
        fr.add(desktopPane);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
        
    }
}
