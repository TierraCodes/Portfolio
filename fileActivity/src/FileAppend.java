import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("favCourses.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String name = JOptionPane.showInputDialog("Enter your first name");
            String course1 = JOptionPane.showInputDialog("Enter your first favorite course");
            String course2 = JOptionPane.showInputDialog("Enter your second favorite course");

            output.printf("%s %s %s", name, course1, course2);
            fileWriter.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
