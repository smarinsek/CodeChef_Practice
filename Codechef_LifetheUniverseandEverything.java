package codechef_lifetheuniverseandeverything;

import java.util.Scanner;

/**
 * Complete the codechef practice problem: Life, the Universe, and Everything
 * 
 * @author Stephen
 * @version 1.0
 */
class Codechef_LifetheUniverseandEverything {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int intInput = 0;       
        Scanner input = new Scanner(System.in);
        
        while (intInput != 42) {
            intInput = input.nextInt();
            if(intInput != 42) {
                System.out.println(intInput);
            }
        }
    }  
}
