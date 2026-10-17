package Day02;
import java.util.Scanner;

public class Function_assignment_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int fact=factorial(num);
        System.out.println(fact);
    }
    static int factorial(int num){
        int fact=1;
        if(num==0 || num==1){
            return num;
        }
        for(int i=1;i<=num;i++){
            fact=i*fact;
        }return fact;
    }
}
