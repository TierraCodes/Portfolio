package classArraylists;
import java.util.Objects;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        CourseInfo demo = new CourseInfo();
        String move = "true";
        while (!Objects.equals(move, "q")){
            System.out.println("Enter the course name: ");
            demo.addCourse(keys.nextLine());
            System.out.println("Enter the GPA: ");
            demo.addGPA(Double.parseDouble(keys.nextLine()));
            System.out.println("Enter the score: ");
            demo.addScore(Integer.parseInt(keys.nextLine()));
            System.out.println("Enter the letter grade: ");
            demo.addGrade(keys.nextLine().charAt(0));
            System.out.println("Add another or enter q to quit.");
            move = keys.nextLine();
        }
        demo.printAll();
    }
}
