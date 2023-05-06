package abstractClasses;

public class Test {
    public static void main(String[] args){
        Dogs husky = new Dogs(1,"Husky","Flora","Large");
        System.out.printf("Animal Info: %s%n", husky.findAnimalInfo());
    }
}
