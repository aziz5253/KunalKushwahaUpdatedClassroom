package Function.src;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String args[])
    {
        //create a array
        int[] arr = {1,3,2,45,6};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeArr(int[] nums)
    {
        nums[0] = 99;//If you make a change to the object via reference variable same object will be change

    }

}
