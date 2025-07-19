import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int num[] = {3,4,5,12};
        System.out.println(Arrays.toString(num));
        changeFun(num);
        System.out.println(Arrays.toString(num));
    }

    private static void changeFun(int[] num) {
        num[0]=99;
        num[3]=452;
    }
}
