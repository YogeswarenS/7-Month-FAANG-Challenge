package DSA.Arrays.Easy;

public class remove_duplicates_in_sorted {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4,5};
        int newLength=removeDuplicates(arr);
        System.out.println("New length: "+newLength);
        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<newLength;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
    
}
