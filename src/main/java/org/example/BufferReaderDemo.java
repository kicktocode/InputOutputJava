package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        Integer integer = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Reading String:  "+ string);
        System.out.println("Reading Integer:  "+ integer);
    }
}