package interfaces;

public class Cats implements Info{
    private int number;
    private String type;
    private String name;
    private double whiskerLength;
    private String color;

    public Cats(int number,String type,String name,double whiskerLength, String color)
    {
        this.number = number;
        this.name = name;
        this.type = type;
        this.whiskerLength = whiskerLength;
        this.color = color;
    }
    public double getWhiskerLength(){
        return whiskerLength;
    }
    public void setWhiskerLength(double whiskerLength){
        this.whiskerLength = whiskerLength;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String findAnimalInfo(){
        return ""+whiskerLength+" "+color;
    }
}
