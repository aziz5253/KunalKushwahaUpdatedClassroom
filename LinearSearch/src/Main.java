//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int[] nums={23,45,1,2,8,19,-3,16,-11,28};
    int target=100;
    boolean ans=linearSearch(nums,target);
    System.out.println(ans);

    }
    //search in array: return index if item found
    //otherwise if item not found return -1
    static boolean linearSearch(int[] arr,int target)
    {
        if(arr.length == 0)
        {
            return false;
        }
        for(int element:arr)
        {
            if(element==target)
                return true;
        }
        return false;
    }
}