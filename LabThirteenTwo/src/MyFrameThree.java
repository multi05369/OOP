
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
public class MyFrameThree{
    public static boolean isPaused;
    public static void main(String[] args) {
        JFrame fr = new JFrame("TimeThai");
        MyClockThree clock = new MyClockThree();
        Thread t = new Thread(clock);
        t.start();
        fr.add(clock);
        fr.setSize(220, 100);
        fr.addMouseListener(new MouseListener() {
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
            public void mouseClicked(MouseEvent e) {
                isPaused = !isPaused;
                if (isPaused) {
                    clock.pauseThread();
                } else {
                    clock.resumeThread();
                }
            }
            
        });
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
