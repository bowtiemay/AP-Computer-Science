/*
*This program takes an input price and outputs the number of dollars, 
*quarters, dimes, nickels, and pennies that make up the input price.
*
*/
package unit2lab2_mayacobb1184506;

import java.util.Scanner;

public class Unit2Lab2_mayacobb1184506 
{
  public static void main( String [] args )
  {
    // Define and initialize variables for values to be input
    double price;
    int dollars;
    double quarters;
    double dimes;
    double nickels;
    double pennies;
  
    // Use a Scanner to input integer values
    Scanner input = new Scanner( System.in );
    System.out.print( "\n" + "Enter a price dollars and cents (exclude the dollar sign): " );
    price = input.nextDouble();     // Input first value
    
    
    
    //find number of dollars
    dollars = (int) price;
    
    //find number of quarters
    double dollars2 = (double) dollars;
    quarters = (( price - dollars2 ) / 0.25);
    int quarters2 = (int) quarters;
   
    //find number of dimes
    dimes = ((( price - dollars) - ( quarters2 * 0.25 )) / .10 );//dimes = amount of cents minus the value of quarters
    int dimes2 = (int) dimes;
    
    //find number of nickels
    nickels = ((( price - dollars ) - (( quarters2 * 0.25 ) + ( dimes2 * 0.10 ))) / .05 );
    int nickels2 = (int) nickels;
            
    //find number of pennies
    pennies = ((( price - dollars2 ) - (( quarters2 * 0.25 ) + ( dimes2 * 0.10 ) + ( nickels2 * 0.05 ))) / .009);
    int pennies2 = (int) pennies;
    
    //display the complete result
    System.out.println("$" + price + " consists of " + dollars + " dollar(s), " + quarters2 + " quarter(s), " + dimes2 + " dime(s), " + nickels2 + " nickel(s), " + pennies2 + " pennies");
    System.out.println();
    
  
  }
}
