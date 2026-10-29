package DSA.Arrays.Easy;

import java.util.Arrays;

public class Reverse_a_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        reverse(arr,n);
    }
    public static void reverse(int[] arr, int n) {
        int j=n-1;
        for(int i=0;i<n;i++){
            if(j>=i){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
