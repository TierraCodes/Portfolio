package stringArrayList;
import java.util.ArrayList;
public class StringArrayList {
    ArrayList<String> dancerNames = new ArrayList<>();

    public void addDancer(String name){
        dancerNames.add(name);
    }
    public void deleteDancer(String name){
        dancerNames.remove(name);
    }
    public int numbOfDancers(){
        return dancerNames.size();
    }
    public String findDancer(int place){
        return dancerNames.get(place);
    }
    public void display1(){
        for(int wins = 0; wins < dancerNames.size(); wins++){
            System.out.printf("* %s%n", dancerNames.get(wins));
        }
    }
    public void display2(){
        for(Object dancer: dancerNames){
            System.out.printf(" - %s%n - ", dancer);
        }
    }
}
