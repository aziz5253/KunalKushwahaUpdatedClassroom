import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=12;
        arr[1]=5;
        arr[2]=7;
        arr[3]=543;
        arr[4]=125;
        System.out.println(arr[3]);
        /*for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
      /*  for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(Arrays.toString(arr));*/
        //Array of object
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "Kunal";
        System.out.println(Arrays.toString(str));

    }
}
