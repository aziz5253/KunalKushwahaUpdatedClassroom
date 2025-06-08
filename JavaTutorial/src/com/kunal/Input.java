package com.kunal;

import java.util.Scanner;

public class Input {
    public static void main(String a[])
    {
        System.out.print("Please enter some Input:");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your roll no is "+rollno);
        int ab = 234_000_000;
        System.out.println(ab);
        float marks = input.nextFloat();
        System.out.println(marks);


    }
}
