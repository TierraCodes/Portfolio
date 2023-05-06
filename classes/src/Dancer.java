public class Dancer {
    public String name;
    public int age;
    public String style;
    public String level;

    public Dancer(){
        name = "Test Name";
        age = 0;
        style = "Test Style";
        level = "Test Level";
    }
    public Dancer(String name,int age,String style,String level){
        this.name = name;
        this.age = age;
        this.style = style;
        this.level = level;
    }
    public void display(){
        System.out.println("The dancer's name is: "+name);
        System.out.println("Their age is: "+age);
        System.out.println("Their best style is: "+style);
        System.out.println("Their dance level is: "+level);
        System.out.println();
    }
}
