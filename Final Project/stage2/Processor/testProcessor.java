// package FinalProject.stage2.Processor;
// package com.mkyong.io.utils.ResourceHelper;
// import com.mkyong.io.utils.ResourceHelper;

import java.io.*;
import java.nio.*;
import java.util.stream.Stream;

// import java.util.Scanner;

public class testProcessor {
    public static void main(String[] args) throws IOException {
        String fileName = "..\\Sales Sept 2022.csv";
        // File file = new File(fileName);
        String yas;
        try (FileInputStream yo = new FileInputStream(fileName)) {
            int a = yo.read();
            System.out.println(a);
        }
    }
}