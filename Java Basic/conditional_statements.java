

// we will learn about

// 1. if - else
// 2. else - if
// 3. switch
// 4. break

import java.rmi.StubNotFoundException;
import java.util.*;
public class conditional_statements {
    public static void main (String args[]){

        // if - else conditon


        // int a = 10;
        // int b = 20;
        // int sum= a+b;

        // if (sum>100){
        //     System.out.println("It's 100 +");
        // }
        // else {
        //     System.out.println("It's below 100");
        // }

        // --------------------------------else- if--------------------------------

        //we will take input from user to check its valid to vote or not
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // // conditon
        // if (age<18){
        //     System.out.println("You can't vote");
        // }
        // else if (age>18 && age<80){
        //     System.out.println("You cant vote");
        // }
        // else{
        //     System.out.println("Invaild age limit");
        // }


       // using abouve code for switch stament
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        //---------------------------------------- switch case-------------------------------------------
        switch (price){
           case 1 : System.out.println("Below avg not fresh");
           break;
           case 2 :System.out.println("between average but below ");
           break;
           case 3 :System.out.println("between average between ");
           break;
           case 4 : System.out.println("between average costly ");
           break;
           default : System.out.println("Invalid price");
        }
       

        }
}
