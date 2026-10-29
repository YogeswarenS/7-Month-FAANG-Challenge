package DSA.Arrays.Easy;

import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        int[] arr={43,6,7,23,55,86,54,26,70};
        int result=secondLargestElement(arr);
        System.out.println(result);
    }
    public static int secondLargestElement(int[] nums) {
        int largest=nums[0];
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=largest){
                largest=nums[i];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]<largest && nums[j]>secondlargest){
                secondlargest=nums[j];
            }
        }
        if(secondlargest==Integer.MIN_VALUE){
            return -1;
        }return secondlargest;
    }
}
