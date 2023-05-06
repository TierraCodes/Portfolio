package act2;
import javax.swing.*;
public class TestScores {
    public static void main(String[] args){
        int score1, score2, score3;
        score1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter score 1:"));
        score2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter score 2:"));
        score3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter score 3:"));
        double average = (score1+score2+score3)/3;

        String grade;
        if (average>=90)
            grade = "A";
        else if (average>=80)
            grade = "B";
        else if (average>=70)
            grade = "C";
        else if (average>=60)
            grade = "D";
        else
            grade = "F";
        JOptionPane.showMessageDialog(null, String.format("Score average: %s \nGrade: %s", average, grade));
    }
}
