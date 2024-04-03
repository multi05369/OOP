import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JTextArea txt;
    private JTextField tf;
    private JButton btn, btn2;
    
    public ChatDemo() {
        fr = new JFrame("ChatDemo");
        txt = new JTextArea();
        tf = new JTextField();
        btn = new JButton("Submit");
        btn2 = new JButton("Reset");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        txt.setEditable(false);
        tf.setSize(45, 5);
        txt.setSize(45, 20);
        txt.setForeground(Color.blue);
        
        btn.addActionListener(this);
        btn2.addActionListener(this);
        
        p1.setLayout(new BorderLayout());
        p1.add(txt, BorderLayout.CENTER);
        p1.add(tf, BorderLayout.SOUTH);
        p2.setLayout(new BorderLayout());
        p2.add(p1, BorderLayout.CENTER);
        p3.setLayout(new FlowLayout());
        p3.add(btn);
        p3.add(btn2);
        p2.add(p3, BorderLayout.SOUTH);
        p4.setLayout(new BorderLayout());
        p4.add(p2);
        
        fr.add(p4);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(450, 300);
        fr.setVisible(true);
        
        fr.addWindowListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss : ");
            txt.setText(txt.getText() + "\n" + dtf.format(LocalDateTime.now()) + tf.getText());
            tf.setText("");
        }
        else if (ae.getSource().equals(btn2)) {
            txt.setText("");
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
        try (FileInputStream fin = new FileInputStream("chatdemo.dat");
             InputStreamReader isr = new InputStreamReader(fin);
             BufferedReader reader = new BufferedReader(isr);) {
            String line;
            while ((line = reader.readLine()) != null) {
                txt.append(line + "\n");
            }
        }
        catch ( IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("chatdemo.dat");
             OutputStreamWriter osw = new OutputStreamWriter(fout);
             BufferedWriter writer = new BufferedWriter(osw);) {
            writer.write(txt.getText());
        }
        catch (IOException ex) {
            ex.printStackTrace();
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
