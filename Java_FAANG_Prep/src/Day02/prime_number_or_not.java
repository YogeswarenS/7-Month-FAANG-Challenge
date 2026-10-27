package Day02;
import java.util.Scanner;

public class prime_number_or_not {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if(num==0 || num==1){
            System.out.println("Invalid");
        }
        if(num==2){
            System.out.println("Only Even prime number");
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count<1){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It's not a prime number");
        }
    }
}
