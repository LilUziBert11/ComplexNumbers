/*
* ComplexNumber
*  Programmer: Albert Duenas
   Date: 10-11-22
   Version: 1.2
   Description: A java class adds and subtracts imaginary numbers. Has private data members imaginaryPart and realPart/
   * Has getters and setters for private numbers./
 */
public class ComplexNumber {
    //private data members
    private int imaginaryPart;
    private int realPart;

    //constructor
    public ComplexNumber(int imaginaryPart, int realPart){
        this.imaginaryPart = imaginaryPart;
        this.realPart = realPart;
    }

    //getters and setters
    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public void setRealPart(int realPart){
        this.realPart = realPart;
    }

    public int getRealPart() {
        return realPart;
    }
    //Method to add two complex numbers
    public ComplexNumber addComplexNumbers(ComplexNumber a, ComplexNumber b){
        int sumOfRealParts = a.getRealPart() + b.getRealPart();
        int sumOfImaginaryParts = a.getImaginaryPart() + b.getImaginaryPart();
        ComplexNumber sum = new ComplexNumber(sumOfImaginaryParts, sumOfRealParts);
        return sum;
    }
    //Method to subtract two complex numbers
    public ComplexNumber subtractComplexNumbers(ComplexNumber a, ComplexNumber b){
        int differenceOfRealParts = a.getRealPart() - b.getRealPart();
        int differenceOfImaginaryParts = a.getImaginaryPart() - b.getImaginaryPart();
        ComplexNumber difference = new ComplexNumber(differenceOfImaginaryParts, differenceOfRealParts);
        return difference;
    }
    //Method to print a complex number
    public void printComplexNumber(ComplexNumber a){
        System.out.format("%d%+di\r\n", realPart, imaginaryPart);

    }
}
