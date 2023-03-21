//for loop  :-  (Start ; step ; stop ) or ( initialisation ; conditiona ; updation)
//while loop  :- 
// do while loop

public class loops {
    public static void main(String args[]) {

        // ---------------------------------for loop ------------------------------------------
        // for(int counter = 0; counter < 4; counter=counter +1 ){
        // System.out.println("*");
        // }


        // ---------------------------------while loop ------------------------------------------
        // int counter = 0;
        // while (counter < 10){
        //     System.out.println(counter);
        //     counter=counter+1;
        // }

        // --------------------------------- do while loop ------------------------------------------

        int counter = 0;
        do{
            System.out.println(counter);
            counter=counter+1;
        }
        while (counter < 12);
    }
}
