public class MaxArray {
    public static void main(String[] args) {
        int [] arr={1,3,23,9,18};
        System.out.println(maxArray(arr));
    }

    private static int maxArray(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
