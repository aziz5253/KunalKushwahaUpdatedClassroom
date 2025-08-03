public class MinNumber {
    public static void main(String[] args) {
        int arr[]={18,12,-7,3,14,28};
        System.out.println(minimumArray(arr));
    }

    private static int minimumArray(int[] arr) {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
}
