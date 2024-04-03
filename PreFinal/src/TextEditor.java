import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TextEditor implements ActionListener {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu file;
    private JMenuItem neww, open, save, close;
    private JTextArea ta;
    private JPanel p1;
    
    public TextEditor() {
        fr = new JFrame("My Text Editor");
        mb = new JMenuBar();
        file = new JMenu("File");
        neww = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        close = new JMenuItem("Close");
        ta = new JTextArea();
        p1 = new JPanel();
        
        
        p1.setLayout(new BorderLayout());
        p1.add(ta);
        fr.setJMenuBar(mb);
        mb.add(file);
        file.add(neww).addActionListener(this);
        file.add(open).addActionListener(this);
        file.add(save).addActionListener(this);
        file.addSeparator();
        file.add(close).addActionListener(this);
        fr.add(p1);
        
        fr.setSize(300, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(neww)) {
            ta.setText("");
        }
        else if (e.getSource().equals(open)) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
            try (FileInputStream fin = new FileInputStream(f);
                 InputStreamReader isr = new InputStreamReader(fin);
                 BufferedReader br = new BufferedReader(isr);) {
                String line;
                while ((line = br.readLine()) != null) {
                    ta.append(line + "\n");
                }
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getSource().equals(save)) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
            try (FileOutputStream fout = new FileOutputStream(f);
                 OutputStreamWriter osw = new OutputStreamWriter(fout);
                 BufferedWriter writer = new BufferedWriter(osw);) {
                writer.write(ta.getText());

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getSource().equals(close)) {
            System.exit(0);
        }
    }
}
