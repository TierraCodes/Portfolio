package act1;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);

        // Get two numbers
        System.out.println("Please enter a number:");
        int numOne = Integer.parseInt(keys.nextLine());
        System.out.println("Please enter another number:");
        int numTwo = Integer.parseInt(keys.nextLine());

        // Calculate the numbers
        int add = numOne + numTwo;
        int sub = Math.max(numOne,numTwo)-Math.min(numOne,numTwo);
        int multiply = numOne*numTwo;
        int div = Math.max(numOne,numTwo)/Math.min(numOne,numTwo);

        double pow1 = Math.pow(numOne,numTwo);
        double pow2 = Math.pow(numTwo,numOne);
        double log1 = Math.log(numOne);
        double log2 = Math.log(numTwo);

        // Print the equations
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + div);
        System.out.println("Power 1: " + pow1);
        System.out.println("Power 2: " + pow2);
        System.out.println("Log 1: " + log1);
        System.out.println("Log 2: " + log2);
    }
}
