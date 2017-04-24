/*
 Prompts user for two positive integers, displays all prime numbers between them
 April 23, 2017
 Brett Castellano
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author Brett
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstNumber, secondNumber;  //range for prime numbers
        int j, i;   //for loops
        int flag = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a positive Integer: ");    //prompt for lower number
        firstNumber = input.nextInt();

        System.out.println("Please enter another positive Integer: ");      //prompt for higher number
        secondNumber = input.nextInt();

        System.out.println("The prime numbers between " + firstNumber + " and " + secondNumber + " are: ");     //sentence for prime numbers

        for (i = firstNumber; i <= secondNumber; i++) {     //create range using users parameters

            /* check to see if i is dividable (no remainder) by essentially any number */
            for (j = 2; j < i; j++) {

                if (i % j == 0) {
                    flag = 0;       //not prime, dividable by another number with no remainder
                    break;
                } else {
                    flag = 1;       //prime
                }

            }
            if (flag == 1) {        //if number (i) is prime, print it 
                System.out.println(i);
            }
        }
    }
}
