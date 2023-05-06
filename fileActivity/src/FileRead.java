import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("favCourses.txt");

        try {
            Scanner input = new Scanner(inputFile);
            String header = input.nextLine();
            System.out.println(header);

            while(input.hasNextLine()) {
                String name = input.next();
                String course1 = input.next();
                String course2 = input.next();
                System.out.printf("%-7s %3s %7s\n",name,course1,course2);
            }
            input.close();
        } catch(FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
}
