
// package FinalProject.stage2.Processor;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class solution {

    public static void main(String[] args) {
        
        runPython(".\\test1.py");

    }

    public static Process mProcess;
    public static void runPython(String fileLocation) {
        Process process;
        try {
            process = Runtime.getRuntime().exec("python " + fileLocation);
            mProcess = process;
        } catch (Exception e) {
            System.out.println("Exception Raised" + e.toString());
        }
        InputStream stdout = (mProcess != null) ? mProcess.getInputStream(): null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(stdout, StandardCharsets.UTF_8));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                System.out.println("stdout: " + line);
            }
        } catch (IOException e) {
            System.out.println("Exception in reading output" + e.toString());
        }
    }
}
