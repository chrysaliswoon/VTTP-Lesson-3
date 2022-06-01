package app.core;
import java.io.Console;

public class ChristmasTree {
    public static void main(String[]args) {
        //? Get the console
        Console cons = System.console();
        String userInput = cons.readLine("Enter height of tree: ").trim().toLowerCase();
        int h = Integer.parseInt(userInput);
        
        
        //? Main Loop
        //? //? Increases the value of i by 1 (i++) if i is less than or equal to the height indicated by the user
        //? This indicates the number of rows we will be creating
        for (int i = 1; i <= h; i++) {   

            //? Creates the first half of the tree
            //? If the height indicated is 5, we will minus it by 1 so j = 4. If j is greater than 0, we will decrease the value of j by 1
            //? This prints the spaces so the * are shifted
            for(int j = h - i; j > 0; j--) {  
                System.out.print(" ");
            }

            //? Creates the second half of the tree
            //? If k is less than or equal to i then it will print out * and increases the value of k by 1.
            //? This prints the * that creates the illusion of the tree
            for (int k = 1; k <= i; k++) { 
                System.out.print("* ");
            }

            //? Creates the stars on another line
            System.out.println();
        }
    }
}