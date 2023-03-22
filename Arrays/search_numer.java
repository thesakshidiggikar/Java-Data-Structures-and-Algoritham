package Arrays;

import java.util.Scanner;

public class search_numer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0 ; i <size ; i ++){
            array[i] = sc.nextInt();
        }

        int j = sc.nextInt();
        
        for(int i =0 ; i <array.length ; i ++){
            if (array[i]==j){
                System.out.println("X found at index:  " + j);
            }
        }
        


        
        
    }
}



//array length
