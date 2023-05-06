import javax.swing.*;
public class Login {
    public static void main(String[] args){
        String userName = "QueenBee19";
        String password = "theTrueQueen";
        String name = JOptionPane.showInputDialog("What is your username?");
        String pw = JOptionPane.showInputDialog("What is your password?");

        if (userName.equals(name) && password.equals(pw))
            JOptionPane.showMessageDialog(null,"Welcome to CS 121!");
        else if (userName.equals(name))
            JOptionPane.showMessageDialog(null,"Your password is incorrect.");
        else if (password.equals(pw))
            JOptionPane.showMessageDialog(null,"Your username is incorrect.");
        else
            JOptionPane.showMessageDialog(null,"Both your username and password are incorrect");


    }
}
