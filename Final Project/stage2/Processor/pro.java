// package FinalProject.stage2.Processor;

// import java.io.*;
// import java.util.Scanner;

// public class testProcessor {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(new File("/Users/jones/Desktop/Hack-A-Thon/Slead Shead data 2/book.csv"));
//         // parsing a CSV file into the constructor of Scanner class
//         sc.useDelimiter(",");
//         // setting comma as delimiter pattern
//         while (sc.hasNext()) {
//             System.out.print(sc.next());
//         }
//         sc.close();
//         // closes the scanner
//     }
// }

import java.io.*;
import java.nio.charset.StandardCharsets;

public class pro {
    public Process mProcess;

    public pro(String fileLocation) {
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