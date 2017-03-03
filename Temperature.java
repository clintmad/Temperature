//Clint Madariaga-Zittel
//This assignment is for converting Fahrenheit to Celsius
//21 February 2017
//Bellevue University
//Temperature.java

import java.util.Scanner;

public class Temperature {
  public static void main(String [] args) {
    //Creates a new Scanner object
    Scanner input = new Scanner(System.in);

    //Prompts the user for a temperature in fahrenheit
    System.out.print("Enter the temperature in Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    //Computes the temperature in celsius
    double celsius = (5.0 / 9.0)*(fahrenheit - 32.0);
    System.out.println("The temperature in Celsius is: " + celsius);
  }
}