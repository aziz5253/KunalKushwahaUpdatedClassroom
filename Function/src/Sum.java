import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
      //sum();
      //System.out.println(sum2());
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        System.out.println(sum3(num1 , num2));



    }
    static int sum3(int a, int b) {
        return a+b;
    }
    static int sum2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum====="+sum);
    }
    /*
      return_type  name()
     {
     //body
     return statement
     }

     */
}
