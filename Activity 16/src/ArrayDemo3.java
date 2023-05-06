public class ArrayDemo3 {
    public static void main(String[] args){
        String[][] names = { {"Maddie","Chloe","Paige"},{"Nia","Mackenzie","Kendall"} };
        for (String[] row:names){
            for (String col:row){
                System.out.printf("%s ",col);
            }
            System.out.println();
        }
    }
}
