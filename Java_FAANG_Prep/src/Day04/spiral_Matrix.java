package Day04;

import java.util.Arrays;
import java.util.Scanner;

public class spiral_Matrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter row size");
        int n=in.nextInt();
        System.out.println("enter column size");
        int m=in.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
            System.out.println();
        }
        System.out.println("input array");
        for(int[] num:arr){
            System.out.println(Arrays.toString(num));}
        int top = 0;
        int bottom = n- 1;
        int left = 0;
        int right = m- 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}

