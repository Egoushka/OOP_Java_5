package sample.Animals;


import java.util.Calendar;
import java.util.Date;

public class Animal {

    int id;
    String name;
    int behaviorId;
    Integer cost;
    Date date;

    public String getName() {
        return name;
    }

    public int getBehavior() {
            return behaviorId;
    }

    public Integer getCost() {
        return cost;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBehavior(int behavior) {
        this.behaviorId = behavior;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setDate(Long time) {
        date.setTime(time);
    }

    public int getId() {
        return id;
    }

    public Animal(){
        date = Calendar.getInstance().getTime();
    }
    public Animal(int behavior, Integer cost, String name) {
        this.name = name;
        this.behaviorId = behavior;
        this.cost = cost;
        date = Calendar.getInstance().getTime();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", behavior=" + behaviorId +
                '}';
    }

}
