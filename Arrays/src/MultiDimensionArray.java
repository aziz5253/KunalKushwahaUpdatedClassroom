import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {

        int multiDimension[][] = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println(Arrays.toString(multiDimension[0]));
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int row=0;row<arr.length;row++)
        {
            for (int col=0;col<arr[row].length;col++)
            {
                arr[row][col]=in.nextInt();

            }
        }
       /* for (int row=0;row<arr.length;row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }*/
        for(int [] array:arr){
            System.out.println(Arrays.toString(array));
        }
    }
}
