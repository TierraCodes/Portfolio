import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the first length: ");
        int s1 = keyboard.nextInt();
        System.out.print("Please enter the second length: ");
        int s2 = keyboard.nextInt();
        System.out.print("Please enter the third length: ");
        int s3 = keyboard.nextInt();

        if (s1 == s2 && s2 == s3)
            System.out.println("This is an equilateral triangle!");
        else if (s1 == s2 || s1 == s3 || s2 == s3)
            System.out.println("This is an isosceles triange!");
        else
            System.out.println("This is a scalene triangle!");
    }
}
