
import java.awt.*;
import java.util.Calendar;
import javax.swing.*;


public class MyClockTwo extends JLabel implements Runnable{
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        while (true) {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - startTime;
            
            long hour = elapsedTime / 3600000;
            long min = (elapsedTime % 3600000) / 60000;
            long sec = (elapsedTime % 60000) / 1000;
            this.setFont(new Font("Arail", Font.BOLD, 24));
            String timeString = String.format("%02d:%02d:%02d", hour, min, sec);
            this.setText(timeString);
            this.setForeground(Color.green);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
