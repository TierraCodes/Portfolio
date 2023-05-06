public class TestClass {
    public static void main(String[] args){
        Dancer maddie = new Dancer("Maddie",12,"Lyrical","Advanced");
        maddie.display();
        Dancer test = new Dancer();
        test.display();

        DanceClass ballet = new DanceClass("Ballet","Abby",6);
        ballet.display();
        DanceClass newTest = new DanceClass();
        newTest.display();
    }
}
