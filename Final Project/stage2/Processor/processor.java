import java.io.*;
import java.util.Scanner;

public class processor {

    public static void Processor(String filepath) {
        
        Scanner sc = new Scanner(filepath);
        //parsing a CSV file into the constructor of Scanner class 
        sc.useDelimiter(",");
        //setting comma as delimiter pattern
        while (sc.hasNext()) {
        System.out.print(sc.next());
        }
        sc.close();
        //closes the scanner  

    }

}