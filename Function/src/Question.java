import java.util.Scanner;

public class Question {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println("ans===="+ans);
        boolean armStrong = isArmstrong(n);
        System.out.println("armStrong===="+armStrong);
    }

     static boolean isPrime(int n) {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while(c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        return c*c >n;

    }

    static boolean isArmstrong(int n)
    {
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem,3);
            n=n/10;

        }
        return sum==original;
    }
}
