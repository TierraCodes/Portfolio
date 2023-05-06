public class DanceClass {
    public String cName;
    public String cTeacher;
    public int hours;

    public DanceClass(){
        cName = "Class Name";
        cTeacher = "Class Teacher";
        hours = 0;
    }
    public DanceClass(String cName,String cTeacher,int hours){
        this.cName = cName;
        this.cTeacher = cTeacher;
        this.hours = hours;
    }
    public void display(){
        System.out.println("The class name is: "+cName);
        System.out.println("The class will be taught by: "+cTeacher);
        System.out.println("The amount of hours every week is: "+hours);
        System.out.println();
    }
}
