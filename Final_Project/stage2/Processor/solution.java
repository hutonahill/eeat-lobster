
// package FinalProject.stage2.Processor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import org.python.util.PythonInterpreter;

public class solution {
    // Variables
    private String fileLocation;

    // Constructors
    public solution() {
    }

    public solution(String fileLocation) {
        setfileLocation(fileLocation);
    }

    // Getters and Setters
    public String getfileLocation() {
        return this.fileLocation;
    }

    public void setfileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    // Methods
    public void run() {
        System.out.println("This works");
        runPython("Final_Project\\stage2\\Processor\\test1.py");

    }

    public static Process mProcess;

    public static void runPython(String fileLocation) {
        System.out.println("I am in runPython");

        try (PythonInterpreter pyInterp = new PythonInterpreter()) {
            pyInterp.exec("from test1 import PythonClass\npc = PythonClass()\npc.nameOfFunction()");
        }

        String pythonFile = fileLocation;
        Process process;
        try {
            process = Runtime.getRuntime().exec(pythonFile);
            mProcess = process;
            System.out.println(mProcess);
        } catch (Exception e) {
            System.out.println("Exception Raised" + e.toString());
        }
        InputStream stdout = (mProcess != null) ? mProcess.getInputStream() : null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(stdout, StandardCharsets.UTF_8));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                System.out.println("stdout: " + line);
                System.out.println("Test Line");
            }
        } catch (IOException e) {
            System.out.println("Exception in reading output" + e.toString());
        }
    }
}
