import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr={1,3,23,9,18,56};
        System.out.println(Arrays.toString(arr));
        //swapArray(arr,1,3);
        //System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }

    }

    private static void swapArray(int[] arr, int idx1, int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
}
