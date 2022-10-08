// package FinalProject.stage2.Processor;

import java.io.*;

public class testProcessor {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/Users/jones/Desktop/Hack-A-Thon/Slead Shead data 2/salesTestFile.csv");
            out = new FileOutputStream("/Users/jones/Desktop/Hack-A-Thon/Slead Shead data 2/salesTestFile1.csv");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}
