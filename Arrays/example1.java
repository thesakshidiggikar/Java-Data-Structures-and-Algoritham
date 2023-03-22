package Arrays;

import java.io.OutputStream;
import java.util.Scanner;

public class example1 {
    public static void main(String args[]) {
        // int arrayName= new int [5]; >>>> this way you can define array
        // java indexing starts with 0.

        int marks[] = new int[3]; // [] represent array
        marks[0] = 98;
        marks[1] = 90;
        marks[2] = 88;
        // // System.out.println(marks); // it will print garbage value

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for (int i =0 ; i <3; i ++){
        // System.out.println(marks[i]);
        // }

        // type [] arrayName= {1,2,3,4,5,6} // second way to write array
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size]; // defining an array


        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }
    }
}
