
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.util.logging.*;
import java.util.logging.Logger;
import java.util.Date;


public class logTest {
    public static void main(String[] args) {
        
        //creates the logger and spesifies the name of the logger
        Logger logger = Logger.getLogger("MyLog");  
        FileHandler fh;  

        
        try {  
            //get parent directory
            String parentDirectory; 
            parentDirectory = System.getProperty("user.dir") + ("\\..\\");

            //append log file name to parent directory
            String logLocation = parentDirectory + "pyJavaLatest.log";

            // This block configure the logger with handler 
            fh = new FileHandler(logLocation, true);
            logger.addHandler(fh);
            
            //add formater to logger
            // SimpleFormatter formatter = new SimpleFormatter();
            MyFormatter formatter = new MyFormatter();  
            fh.setFormatter(formatter);  
            
    
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  

        // the following statement is used to log any messages  
        logger.info("Java Log");  
    
    }
}

class MyFormatter extends Formatter {
    // Create a DateFormat to format the logger timestamp.
    private static final DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");

    public String format(LogRecord record) {
        StringBuilder builder = new StringBuilder(1000);
        builder.append(df.format(new Date(record.getMillis()))).append(" - ");
        builder.append(record.getSourceClassName()).append(".java - ");
        builder.append(record.getSourceMethodName()).append("() - ");
        builder.append(record.getLevel()).append(": ");
        builder.append(formatMessage(record));
        builder.append("\n");
        return builder.toString();
    }

    public String getHead(Handler h) {
        return super.getHead(h);
    }

    public String getTail(Handler h) {
        return super.getTail(h);
    }
}
