package DSA.Arrays.Easy;

public class max_consecutive_ones {public static void main(String[] args) {
    int[] arr={1,1,1,0,0,1,1,1,1,0,0,1,1};
    int result=findMaxConsecutiveOnes(arr);
    System.out.println(result);
}
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int secondcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else
            {
                count=0;
            }
            if(count>=secondcount){
                secondcount=count;
            }
        }return secondcount;
    }
}
