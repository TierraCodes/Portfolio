package interfaces;

public class Dogs implements Info{
    private int number;
    private String type;
    private String name;
    private String size;

    public Dogs(int number,String type,String name,String size){
        this.number = number;
        this.name = name;
        this.type = type;
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String findAnimalInfo(){
        return size;
    }
}
