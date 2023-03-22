package function_and_methods;

import java.util.Scanner;

public class multiplication {
    public static void Multiplication(int a, int b){
        int sum= a * b; 
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Multiplication(a, b);
    }

}
