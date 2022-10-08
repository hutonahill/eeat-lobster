

import javax.swing.JFrame;

import java.io.IOException;
import java.util.logging.*;
import java.util.logging.Logger;

public class UITest {


    public static void main(String[] args) {
        
        //creates the logger and spesifies the name of the logger
        Logger logger = Logger.getLogger("MyLog");  
        FileHandler fh;  
    
        try {  
    
            // This block configure the logger with handler and formatter  
            fh = new FileHandler("MyLogFile.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
    
            // the following statement is used to log any messages  
            logger.info("My first log");  
    
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    
        logger.info("Hi How r u?");

        myFrame frame1 = new myFrame( 
  

        
        
    }
    
}



  