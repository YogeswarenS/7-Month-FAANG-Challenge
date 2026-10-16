package Day01;
import java.util.Scanner;

public class if_else_practice {
    public static void main(String[] args){

        // Write a program that takes an integer input (a year)
        // and prints whether it is a Leap Year or not.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year :");
        int year= sc.nextInt();

        if (year%4==0 || year%400==0){
            System.out.println("It's a Leap Year");}
        else
        {
            System.out.println("It's not a Leap Year");
        }
    }
}
