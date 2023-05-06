package inheritance;

public class DaysDancing extends Dancer{
    int days;

    public DaysDancing(String name, int age, int id, int days){
        super(id,age,name);
        this.days = days;
    }
    public int getDays(){
        return days;
    }
    public void setDays(int newDays){
        this.days = newDays;
    }
    public String toString(){
        return String.format("ID: %d\nName: %s\nAge: %d\nDays: %s\n",getId(),getName(),getAge(),getDays());
    }
}
