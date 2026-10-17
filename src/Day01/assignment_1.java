package Day01;
import java.util.Scanner;

// Write a quick snippet using a Scanner that takes a student's marks (0-100) and
// prints "Pass" if the marks are greater than or equal to 50 AND
// the student attendance is greater than or equal to 75%. Otherwise, print "Fail".

public class assignment_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter student marks : ");
        int marks=sc.nextInt();
        System.out.println("Student's attendance percentage :");
        float attendance =Math.round(sc.nextFloat());
        if(marks>=50 && attendance >=75.00){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
