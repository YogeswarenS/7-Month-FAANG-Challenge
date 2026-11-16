package DSA.Arrays.Easy;


public class second_largest {
    public static void main(String[] args) {
        int[] arr={43,6,7,23,55,86,54,26,70};
        int result=secondLargestElement(arr);
        System.out.println(result);
    }
    public static int secondLargestElement(int[] nums) {
        int largest=nums[0];
        int secondlargest=Integer.MIN_VALUE;
        for (int num : nums) {
            if (num >= largest) {
                largest = num;
            }
        }
        for (int num : nums) {
            if (num < largest && num > secondlargest) {
                secondlargest = num;
            }
        }
        if(secondlargest==Integer.MIN_VALUE){
            return -1;
        }return secondlargest;
    }
}
