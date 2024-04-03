
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import javax.swing.*;


public class MyClockThree extends JLabel implements Runnable{
    private boolean status = false;
    private int time;
    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                while (status) {
                    try {
                        this.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            
            long hour = (time / 3600) % 24;
            long min = (time / 60) % 60;
            long sec = time % 60;
            this.setFont(new Font("Arail", Font.BOLD, 24));
            String timeString = String.format("%02d:%02d:%02d", hour, min, sec);
            this.setText(timeString);
            this.setForeground(Color.green);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            time++;
        }
    }
    public synchronized void pauseThread() {
        status = true;
    }
    public synchronized void resumeThread() {
        status = false;
        this.notify();
    }
}
