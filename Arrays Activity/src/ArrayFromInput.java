import java.util.Scanner;
public class ArrayFromInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String[] firstNames = new String[5];
        int[] grades = new int[5];
        String[] instruments = new String[5];
        for (int i = 0; i<5; i++){
            System.out.println("First name: ");
            firstNames[i] = keyboard.nextLine();
            System.out.println("Grade level: ");
            grades[i] = Integer.parseInt(keyboard.nextLine());
            System.out.println("Instrument: ");
            instruments[i] = keyboard.nextLine();
        }
        System.out.printf("%-14s %s\n", "Name","Instrument");
        for (int i = 0; i < firstNames.length; i++){
            System.out.printf("%-14s %s\n", firstNames[i] + " "+grades[i],instruments[i]);
        }
        keyboard.close();
    }
}
