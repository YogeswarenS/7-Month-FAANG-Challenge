package Day02;

import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=n);
}}

// use when u need the body to be executed at least once without checking condition