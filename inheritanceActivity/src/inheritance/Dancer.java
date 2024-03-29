package inheritance;

public class Dancer {
    int age;
    int id;
    String name;

    public Dancer(int id,int age,String name)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return String.format("ID: %s\nName: %s\nAge: %s\n",id,name,age);
    }
}
