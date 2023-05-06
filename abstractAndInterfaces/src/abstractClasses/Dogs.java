package abstractClasses;

public class Dogs extends Animals{
    //Instance variable
    private String size;
    //Constructor
    public Dogs(int number,String type,String name, String size){
        super(number, type, name);
        this.size = size;
    }
    //Setter
    public void setSize(String size){
        this.size = size;
    }
    //Getter
    public String getSize(){
        return size;
    }
    //Methods
    @Override
    public String toString(){
        return super.toString()+String.format("Size: "+getSize());
    }
    @Override
    public String findAnimalInfo(){
        return size;
    }
}
