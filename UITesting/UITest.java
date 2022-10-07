

import javax.swing.SwingUtilities;
import java.util.logging.Level;

public class UITest {

    public static void main(String[] args) {
        
        // Run this program o nhte Event Dispact Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {

                try {
                    Log myLog = new Log("log.txt");

                    myLog.logger.setLevel(Level.WARNING);

                    myLog.logger.info("test1");

                    myFrame frame1 = new myFrame();
                } catch(Exception e) {
                    System.out.println("error: " + e);
                }
            }

        });

        
        
    }
    
}