package com.kunal.

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId =in.nextInt();
        String department = in.next();
        switch (empId) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Aziz Hotelwala");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct empId");
        }
    }
}
