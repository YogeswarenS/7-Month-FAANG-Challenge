package DSA.Arrays.Easy;

import java.util.Arrays;


/// Two pointers method.


public class moving_zeroes_end {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,3,4,5,0,6,7,0,8,0,9};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]==0){
                break;
            }
            j++;
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }System.out.println(Arrays.toString(nums));
    }
}
