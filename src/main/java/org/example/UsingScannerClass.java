package org.example;

import java.util.Scanner;

public class UsingScannerClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        float marks;
        int rollNumber;
        System.out.println("Enter name :");
        name =scanner.nextLine();
        System.out.println("Entered name :" + name);
        System.out.println("Enter marks :");
        marks= scanner.nextFloat();
        System.out.println("Entered marks: "+ marks);
        System.out.println("Enter roll number :");
        rollNumber = scanner.nextInt();
        System.out.println("Entered roll number : "+rollNumber);
    }
}
