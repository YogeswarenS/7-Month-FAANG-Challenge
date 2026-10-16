package Day01;

import java.sql.SQLOutput;

public class Data_types {
    public static void main(String[] args){

        // Primitive data types
        boolean data = true; //Represents logical values: true or false.

        byte temp = 25; // it stores small numbers ( size : 1 bytes )

        short medium = 1234; // it stores medium numbers ( size : 2 bytes )

        int a= 348567; // it stores large numbers ( size : 4 bytes )

        long verylarge =67900000000L; // it stores very large numbers ( size : 8 bytes )

        float num = 34.896f; // it stores large fractional numbers ( size : 4 bytes )

        double biggy = 345657.7767; // it stores very large whole numbers
                                   //as well as fractional numbers ( size : 8 bytes )

        char alphabet = 'F'; //store single characters like 'w' ,'#','3' ( size : 2 bytes )

        String str = "Hi, this is Yogesh"; // stores words , sentences

        int[] arr={1,2,3,4,5};
        String[] name={"one","two","three","four"}; // stores words/ numbers in array

        System.out.println("Number :"+ a);
        System.out.println(" third Number :"+ arr[2]);
    }
}
