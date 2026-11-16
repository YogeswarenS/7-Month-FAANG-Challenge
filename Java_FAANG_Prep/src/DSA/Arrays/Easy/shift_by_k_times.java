package DSA.Arrays.Easy;

import java.util.Arrays;
/// shift right side
public class shift_by_k_times {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=3; // no of shifts
        rotate(arr,k);
    }
    public static void rotate(int[] nums, int k) {
        k=k%(nums.length);// this is for long length arrays(to minimize time complexity).
        /// this is for right side
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
        /// this is for left shift side
        ///reverse(nums,0,nums.length-1);
        ///reverse(nums,0,nums.length-k-1);
        ///reverse(nums,nums.length-k,nums.length-1);
    }
    public static void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

/// explanation :
/// eg : [1,2,3,4,5,6,7] k=3, output : [5,6,7,1,2,3,4]
/// first reverse entire array : [7,6,5,4,3,2,1]
/// secondly reverse 0 to k-1  : [5,6,7,4,3,2,1]
///thirdly reverse k to nums.length-1 : [5,6,7,1,2,3,4] we got it.
