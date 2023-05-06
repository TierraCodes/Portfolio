package inheritance;

public class HoursDancing extends Dancer{
    int hours;
    double startTime;

    public HoursDancing(int id, int age, String name, int hours, double startTime){
        super(id,age,name);
        this.hours = hours;
        this.startTime = startTime;
    }
    public int getHours(){
        return hours;
    }
    public double getStartTime(){
        return startTime;
    }
    public void setHours(int newHours){
        this.hours = newHours;
    }
    public void setStartTime(int newStartTime){
        this.startTime = newStartTime;
    }

    @Override
    public String toString(){
        return String.format("ID: %d\nName: %s\nAge: %d\nHours: %s\nStart time: %s\n",getId(),getName(),getAge(),getHours(),getStartTime());
    }
}
