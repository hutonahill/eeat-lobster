import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class resetLog {
    public static void main(String[] args) {
        clearOldLog();
    }

    public static void copyLog() {
        // Get parent directory
        String parentDirectory;
        parentDirectory = System.getProperty("user.dir") + ("\\..\\");

        // Get log file path
        String logLocation = parentDirectory + "pyJavaLatest.log";

        // Select log
        File file = new File(logLocation);

        // Get current time
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss_aa");
        String dateTime = sdf.format(cal.getTime());

        //compile new file name
        String newFileName ="pyJava" + dateTime + ".log";

        //compile new file path
        String newLogLocation= parentDirectory + "logs\\" + newFileName;

        //save file
        File newFile = new File(newLogLocation);
        file.renameTo(newFile);
    }

    public static void clearOldLog() {
        
        // Get parent directory
        String parentDirectory;
        parentDirectory = System.getProperty("user.dir") + ("\\..\\");

        // Get log file path
        String logLocation = parentDirectory + "pyJavaLatest.log";
        try{
            FileWriter fwOb = new FileWriter(logLocation, false); 
            PrintWriter pwOb = new PrintWriter(fwOb, false);
            pwOb.flush();
            pwOb.close();
            fwOb.close();
        } catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
    
}
