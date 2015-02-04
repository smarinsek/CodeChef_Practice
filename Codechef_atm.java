package codechef_atm;

import java.util.Scanner;

/**
 * Complete the codechef practice problem: atm
 * 
 * @author Stephen
 * @version 1.0
 */
class Codechef_atm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int withdraw = input.nextInt();
        double balance = input.nextDouble();
        
        if ((withdraw % 5.0 == 0) && (balance >= withdraw + 0.5)) {
            balance = balance - withdraw - 0.5;
        }
        
        System.out.println(String.format("%.2f", balance));
        
    }
}
