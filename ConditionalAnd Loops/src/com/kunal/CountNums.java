package com.kunal;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        int n = 455363535;
        int count=0;
        while(n > 0)
        {
            int rem =  n % 10;
            if(rem==5)
            {
                count++;
            }
            n = n / 10;

        }
        System.out.println("Count=="+count);
    }

    public static class Calculator {
        public static void main(String a[])
        {
            Scanner in = new Scanner(System.in);
            //Take input from user until user does not press x or X
            int ans=0;
            while (true)
            {
                System.out.println("Enter the Operator:");
                char op = in.next().trim().charAt(0);
                if(op == '+' || op =='-'||op == '*' ||op == '/' ||op == '%')
                {
                    System.out.print("Enter two numbers:");
                    int num1 = in.nextInt();
                    int num2= in.nextInt();
                    if(op=='+')
                    {
                        ans=num1+num2;
                    }
                    if(op=='-')
                    {
                        ans=num1-num2;
                    }
                    if(op=='*')
                    {
                        ans=num1*num2;
                    }
                    if(op=='/')
                    {
                        if(num2!=0) ans=num1/num2;
                    }
                    if(op=='%')
                    {
                        ans=num1%num2;
                    }


                }
                else if(op == 'x' || op =='X')
                {
                    break;
                }
                else{
                    System.out.println("Invalid Operator");
                }

                System.out.println(ans);
            }

        }


    }
}
