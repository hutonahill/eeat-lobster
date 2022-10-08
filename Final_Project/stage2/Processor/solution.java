import java.util.List;

import org.python.util.PythonInterpreter;

public class solution {
    // Variables
    private String fileLocation;
    private String[] userInput;

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

    public String[] getUserInput() {
        return this.userInput;
    }

    public void setUserInput(String userInput) {
        String[] newString = fliterStringConversion(userInput);
        this.userInput = newString;
    }

    // Methods
    public void run() {
        System.out.println("This works");
        runPython(fileLocation);

    }

    private static void runPython(String fileLocation) {
        System.out.println("I am in runPython");

        // try (PythonInterpreter pyInterp = new PythonInterpreter()) {
        // pyInterp.exec("from test1 import PythonClass\npc =
        // PythonClass()\npc.nameOfFunction()");
        // }

        try (PythonInterpreter pyInterp = new PythonInterpreter()) {
            pyInterp.exec("from Seeker import Seeker\ndp = Seeker()\ndp.Seek(" + fileLocation + ")");
        }

    }

    private String[] fliterStringConversion(String userInput) {
        String[] prs = userInput.split(userInput);
        if (prs[0] == "No Labor") {
            prs[0] = "1";
        }
        return prs;
    }
}
