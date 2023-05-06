package interfaces;

import abstractClasses.Dogs;

public class Test {
    public static void main(String[] args){
        abstractClasses.Dogs husky = new Dogs(1,"Husky","Flora","Large");
        System.out.printf("Animal Info: %s%n", husky.findAnimalInfo());
    }
}
