package codechef_enormousinput;

/**
 * Codechef Enormous input practice problem
 * 
 * @author Stephen
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Codechef_enormousinput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int[] n = new int[2];
        int ii = 0;
        
        //read in the first two parameters, n and k
        String Line = input.readLine();
        for(String numStr: Line.split("\\s")) {
            n[ii] = Integer.parseInt(numStr);
            ii++;
        }
        
        int divTally = 0;
        int subject = 0;
        
        //check for divisibility and increment divTally if divisible
        for(int i = 0 ; i < n[0] ; i++) {
            if((subject = Integer.parseInt(input.readLine())) % n[1] == 0) {
                divTally++;
            }
        }

        System.out.println(divTally);
    }
}
