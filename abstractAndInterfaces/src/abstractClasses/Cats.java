package abstractClasses;

public class Cats extends Animals{
    //Instance variables
    private double whiskerLength;
    private String color;
    //Constructor
    public Cats(int number, String type, String name, double whiskerLength, String color){
        super(number, type, name);
        this.whiskerLength = whiskerLength;
        this.color = color;
    }
    //Setters
    public void setWhiskerLength(double whiskerLength){
        this.whiskerLength = whiskerLength;
    }
    public void setColor(String color){
        this.color = color;
    }
    //Getters
    public double getWhiskerLength(){
        return whiskerLength;
    }
    public String getColor(){
        return color;
    }
    //Methods
    @Override
    public String toString(){
        return super.toString()+String.format("Whisker Length: " +
                "%.2f%nColor: %s%n",getWhiskerLength(),getColor());
    }
    @Override
    public String findAnimalInfo() {
        return "" + whiskerLength + "" + " " + color;
    }
}
