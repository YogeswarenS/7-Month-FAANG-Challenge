package Day04;
import java.util.Arrays;
import java.util.Scanner;

public class Traversal_2D_Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter row size");
        int n=in.nextInt();
        System.out.println("enter column size");
        int m=in.nextInt();
        int[][] arr=new int[n][m];
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
            System.out.println();
        }
        System.out.println("input array");
        for(int[] num:arr){
            System.out.println(Arrays.toString(num));
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=arr[j][i];
            }
            System.out.println();
        }
        System.out.println("Output: ");
        for(int[] nums:matrix){
            System.out.println(Arrays.toString(nums));
        }
    }
}
