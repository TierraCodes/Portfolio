package stringArrayList;

public class Test {
    public static void main(String[] args){
        StringArrayList testing = new StringArrayList();

        testing.addDancer("Maddie");
        testing.addDancer("Chloe");
        testing.deleteDancer("Maddie");
        testing.addDancer("Nia");
        testing.addDancer("Paige");

        System.out.printf("There are %s dancers listed.\n", testing.numbOfDancers());
        System.out.println("The second dancer listed is "+testing.findDancer(1));

        testing.display1();
        testing.display2();
    }
}
