package Day03;
import java.util.*;

public class Arrays_1D {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int[] nums={1,2,3,6,45}; // manual declaration with elements
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int []arr=new int[n];// general syntax of array declaration
        System.out.println(nums[2]);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); // getting inputs
        }
        System.out.println(Arrays.toString(arr)); // prints all element in list
    }
}
