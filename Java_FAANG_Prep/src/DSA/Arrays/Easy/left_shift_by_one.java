package DSA.Arrays.Easy;
import java.util.Arrays;

public class left_shift_by_one {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        rotateArrayByOne(arr);

    }
    public static void rotateArrayByOne(int[] nums) {
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = first;
        System.out.println(Arrays.toString(nums));
    }
}
