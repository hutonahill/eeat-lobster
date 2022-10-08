
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

        // try (PythonInterpreter pyInterp = new PythonInterpreter()) {
        //     pyInterp.exec("from test1 import PythonClass\npc = PythonClass()\npc.nameOfFunction()");
        // }

        try (PythonInterpreter pyInterp = new PythonInterpreter()) {
            pyInterp.exec("from Seeker import Seeker\ndp = Seeker()\ndp.Seek()");
        }

        
    }
}
