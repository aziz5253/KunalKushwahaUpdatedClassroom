import java.util.Arrays;

public class Searchin2dArray {
    public static void main(String[] args) {
        int[][] arr={{23,4,1},{18,12,13,9},{78,99,34,56},{18,12}};
        int target=34;
        int[] ans=searchArray(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int[]  searchArray(int[][] arr, int target) {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
    static int  max(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for(int []ins:arr)
        {
            for(int ansInt:ins)
            {
                if(ansInt>max)
                    max=ansInt;
            }
        }
        return max;
    }
    static int  min(int[][] arr) {
        int min=Integer.MAX_VALUE;
        for(int row=0;row<arr.length;row++)
        {
            for(int col=1;col<arr[row].length;col++)
            {
                if(arr[row][col]<min)
                    min=arr[row][col];
            }
        }
        return min;
    }
}
