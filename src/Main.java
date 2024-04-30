import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // TASK NR. 1 Two integers are given. How many times can the second number be subtracted from the first number?
        Scanner twoIntegers = new Scanner(System.in);
        System.out.println("Insert 2 Integer numbers: ");
        int firstNumber = twoIntegers.nextInt();
        int secondNumber = twoIntegers.nextInt();
        System.out.println(" Number " + secondNumber + " can be subtracted from " + firstNumber);
        int counter = firstNumber / secondNumber;
        System.out.println(counter + " times ");


        // TASK NR. 2 Create a program that converts temperature from Celsius to Fahrenheit. Prompt the user to enter a temperature in Celsius,
        // perform the conversion, and display the result.

        Scanner celsius = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double enterCelsius = celsius.nextDouble();
        double fahrenheit = enterCelsius * 9 / 5 + 32;
        System.out.println("Temperature Celsius " + enterCelsius + " To Fahrenheit is " + fahrenheit);


        //TASK NR. 3 Write a Java program to check whether a given number is even or odd.

        Scanner evenOdd = new Scanner(System.in);
        System.out.println("Enter number to find out if even or odd ");
        int number = evenOdd.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is Even ");
        } else {
            System.out.println("Number " + number + " is Odd");
        }
    }
}



