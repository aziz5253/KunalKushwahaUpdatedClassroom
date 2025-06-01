package com.kunal;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        System.out.println(ch);
        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowecase");
        }
        else{
            System.out.println("Uppercase");
        }

    }
}
