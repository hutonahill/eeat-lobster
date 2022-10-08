import org.python.util.PythonInterpreter;
import java.util.List;

public class solution {
    // Variables
    private String fileLocation;
    private List<Boolean> userInput;

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

    public List<Boolean> getUserInput() {
        return this.userInput;
    }

    public void setUserInput(List<Boolean> userInput) {
        this.userInput = userInput;
    }

    // Methods
    public void run() {
        System.out.println("This works");
        runPython(fileLocation);

    }

    public static void runPython(String fileLocation) {
        System.out.println("I am in runPython");

        // try (PythonInterpreter pyInterp = new PythonInterpreter()) {
        // pyInterp.exec("from test1 import PythonClass\npc =
        // PythonClass()\npc.nameOfFunction()");
        // }

        try (PythonInterpreter pyInterp = new PythonInterpreter()) {
            pyInterp.exec("from Seeker import Seeker\ndp = Seeker()\ndp.Seek("+ fileLocation +")");
        }

    }
}
