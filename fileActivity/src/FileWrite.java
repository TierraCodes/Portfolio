import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("favCourses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String name,course1,course2;

        output.printf("%s %s %s\n", "name", "favoriteCourse1", "favoriteCourse2");
        for (int i = 1; i<=3; i++) {
            name = JOptionPane.showInputDialog(String.format("Enter your first name %d",i));
            course1 = JOptionPane.showInputDialog("Enter your first favorite course ");
            course2 = JOptionPane.showInputDialog("Enter your second favorite course ");

            output.printf("%s %s %s\n", name, course1, course2);
        }
        output.close();
    }
}
