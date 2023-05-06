import java.util.Scanner;
public class SwitchActivity {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String hogHouse;

        System.out.print("What is your Hogwarts House?");
        hogHouse = keyboard.nextLine();

        switch (hogHouse)
        {
            case "Gryffindor":
                System.out.print("Symbol: Lion \nTrait: Bravery \nElement: Fire");
                break;
            case "Hufflepuff":
                System.out.print("Symbol: Badger \nTrait: Empathy \nElement: Earth");
                break;
            case "Ravenclaw":
                System.out.print("Symbol: Eagle \nTrait: Intelligence \nElement: Air");
                break;
            case "Slytherin":
                System.out.print("Symbol: Serpent \nTrait: Ambition \nElement: Water");
                break;
        }

    }
}
