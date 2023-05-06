package act2;
import javax.swing.*;
public class BookClubPoints {
    public static void main(String[] args) {
        int books;
        String input;
        int points = 0;

        input = JOptionPane.showInputDialog("How many books have you purchased this month?");
        books = Integer.parseInt(input);

        if (books==0)
            points = 0;
        else if (books==1)
            points = 5;
        else if (books==2)
            points = 15;
        else if (books==3)
            points = 30;
        else if (books>=4)
            points = 60;

        JOptionPane.showMessageDialog(null,"You've earned " + String.valueOf(points) + " points!");

    }
}
