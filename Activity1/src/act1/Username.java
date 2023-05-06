package act1;
import javax.swing.*;
import java.lang.*;
public class Username {
    public static void main(String[] args) {

        String firstname = JOptionPane.showInputDialog("What is your first name?");
        String lastname = JOptionPane.showInputDialog("What is your last name?");
        String name = firstname +" "+ lastname;
        JOptionPane.showMessageDialog(null, String.format("%s", name.toLowerCase()));
        JOptionPane.showMessageDialog(null, String.format("%s", name.toUpperCase()));


        StringBuilder fullName = new StringBuilder();
        fullName.append(name);
        JOptionPane.showMessageDialog(null, String.format("%s", fullName.reverse()));

    }
}
