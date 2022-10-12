/*
* ComplexNumber
*  Programmer: Albert Duenas
   Date: 10-11-22
   Version: 1.2
   Description: A java program that adds and subtracts two complex numbers. This program prompts the user for values and
   *  passes them in to the ComplexNumber constructor.*/
import java.util.Scanner;

public class ComplexNumberCalculator {
    public static void main(String[] args){
        //Declaring new scanner class
        Scanner sc = new Scanner (System.in);

        //Asking user what the first real part is
        System.out.println("What is the real part of the first complex number?");
        String firstRealPartString = sc.nextLine();

        //Asking user what the first imaginary part is
        System.out.println("What is the imaginary part of the first complex number?");
        String firstImaginaryPartString = sc.nextLine();

        //Asking user what the second real part is
        System.out.println("What is the real part of the second complex number?");
        String secondRealPartString = sc.nextLine();

        //Asking user what the second imaginary part is
        System.out.println("What is the imaginary part of the second complex number?");
        String secondImaginaryPartString = sc.nextLine();

        //parsing user inputs
        int firstRealPart = Integer.parseInt(firstRealPartString);
        int firstImaginaryPart  = Integer.parseInt(firstImaginaryPartString);
        int secondRealPart  = Integer.parseInt(secondRealPartString);
        int secondImaginaryPart  = Integer.parseInt(secondImaginaryPartString);
        //Creating new complex numbers with user input
        ComplexNumber a = new ComplexNumber(firstImaginaryPart, firstRealPart);
        ComplexNumber b = new ComplexNumber(secondImaginaryPart, secondRealPart);
        //Adding and subtracting user created complex numbers
        ComplexNumber sum = a.addComplexNumbers(a, b);
        ComplexNumber difference = a.subtractComplexNumbers(a, b);
        //Displaying results of addition and subtraction
        System.out.print("The sum of the two complex numbers is: ");
        sum.printComplexNumber(sum);
        System.out.print("The difference of the two complex numbers is: ");
        difference.printComplexNumber(difference);
    }
}
