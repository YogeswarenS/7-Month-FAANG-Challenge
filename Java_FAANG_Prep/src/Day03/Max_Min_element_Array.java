package Day03;
import java.util.*;

public class Max_Min_element_Array {
    public static void main(String[] args) {
        int[] arr={45,653,-7,236,71,34,78};
        int max=arr[0];
        int min=arr[0];
        //maximum element
        for(int i =1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            //Minimum element
            if(min>arr[i]){
                min=arr[i];
            }
        } System.out.println("Maximum element is : "+ max);
        System.out.println("Minimum element is : "+ min);
    }
}
