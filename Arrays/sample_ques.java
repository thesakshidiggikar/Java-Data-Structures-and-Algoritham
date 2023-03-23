package Arrays;

import java.util.Scanner;

public class sample_ques {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int rows =sc.nextInt();
        int col= sc.nextInt();

        int number[][]=new int[rows][col]

        for (int i=0; i<rows; i++){
            for (int j=0; j<col; j++){
                number[i][j]=sc.nextInt();
            }
        }
    }
}
