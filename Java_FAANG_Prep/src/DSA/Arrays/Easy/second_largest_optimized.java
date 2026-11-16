package DSA.Arrays.Easy;

public class second_largest_optimized {public static void main(String[] args) {
    int[] arr={43,6,7,23,55,86,54,26,70};
    int result=secondLargestElement(arr);
    System.out.println(result);
}
    public static int secondLargestElement(int[] nums) {
        int largest=nums[0];
        int secondlargest=Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                secondlargest=largest;
                largest = num;
            }
            else if(num<largest && num>secondlargest){
                secondlargest=num;
            }
        }return secondlargest;
}}
/// explanation : here firstly, we traverse for largest if new large value is found
/// older largest value becomes second_largest. but in the case eg:{4,,7,7,5}
/// second largest will be 4 and largest will be 7 since 5<7 there is no update to
/// largest and second_largest. thus second_largest will be 4 not 5. to resolve it ,
/// if num<largest we write another else if to compare it with second largest
/// if num>second largest then assign num to second_largest.