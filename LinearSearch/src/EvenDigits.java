public class EvenDigits {
    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7896, 45, -58679,856978};
        int evenCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = countNoOfDigit2(nums[i]);
            if (digits % 2 == 0) evenCounter++;

        }
        System.out.println("evenCounter====" + evenCounter);
    }

    private static int countNoOfDigit(int nums) {
        if (nums < 0) nums = nums * -1;
        if (nums == 0) return 1;
        int count = 0;
        while (nums > 0) {
            nums /= 10;
            count++;
        }
        return count;
    }

    private static int countNoOfDigit2(int nums) {
        if (nums < 0) nums = nums * -1;
        return (int) (Math.log10(nums)) + 1;
    }
}
