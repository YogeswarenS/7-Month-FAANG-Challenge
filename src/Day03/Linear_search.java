package Day03;
import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr={43,6,7,23,55,86,54,26,70};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target : ");
        int target=sc.nextInt();
        int result=linearsearch(target,arr);
        System.out.println("index :"+result);
    }
    public static int linearsearch(int target,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }return -1;
    }
}
