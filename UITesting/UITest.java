package UITesting;

import javax.swing.SwingUtilities;

public class UITest {

    public static void main(String[] args) {
        
        // Run this program o nhte Event Dispact Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                myFrame frame1 = new myFrame(); 
            }

        });

        
        
    }
    
}