package Day01;
import java.util.Scanner;

public class Getting_Inputs {
    public static void main(String[] args){

    // Declare the object and initialize with predefined standard input object
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name:");
    String name = sc.nextLine(); // String input

    System.out.println("Enter your gender (M/F): ");
    char gender = sc.next().charAt(0); // Character input

    System.out.println("Enter your age: ");
    int age = sc.nextInt();// Numerical data input
        // byte, short and float can be read

    System.out.println("Enter your cgpa: ");
    double cgpa = sc.nextDouble(); // larger whole numbers and floating numbers

    System.out.println("Name: " + name);
    System.out.println("Gender: " + gender);
    System.out.println("Age: " + age);
    System.out.println("CGPA: " + cgpa);
}
}
