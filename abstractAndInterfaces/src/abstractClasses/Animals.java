package abstractClasses;

public abstract class Animals {

    //Instance variables
    private int number;
    private String type;
    private String name;


    //Constructor
    public Animals(int number, String type, String name){
        this.number = number;
        this.type = type;
        this.name = name;
    }

    //Setters
    public void setNumber(int number){
        this.number = number;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }

    //Getters
    public int getNumber(){
        return number;
    }
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }

    //Method
    @Override
    public String toString(){
        return String.format("Name: %s%nType: %s%nID: %d%n",name,type,number);
    }
    public abstract String findAnimalInfo();
}
