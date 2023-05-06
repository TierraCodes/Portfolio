package classArraylists;
import java.util.ArrayList;
public class CourseInfo {
    ArrayList<String> courseName = new ArrayList<>();
    ArrayList<Double> GPA = new ArrayList<>();
    ArrayList<Integer> score = new ArrayList<>();
    ArrayList<Character> grade = new ArrayList<>();

    public void addCourse(String newCourse){
        courseName.add(newCourse);
    }
    public void addGPA(double newGPA){
        GPA.add(newGPA);
    }
    public void addScore(int newScore){
        score.add(newScore);
    }
    public void addGrade(char newGrade){
        grade.add(newGrade);
    }
    public void printAll(){
        System.out.printf("%-25s %-5s %-10s %-5s\n", "Course name", "G.P.A", "Score", "Letter Grade");
        for (int line = 0; line < courseName.size();line++){
            System.out.printf("%-25s %-5s %-10s %-5s\n", courseName.get(line), GPA.get(line),score.get(line),grade.get(line));
        }
    }
}
