package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderUsingTryCatch {
    public static void main(String[] args) {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        String string;
        try{
            System.out.println("Enter String");
           string = bufferedReader.readLine();
            System.out.println("Entered String :" + string);
        }
       catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
