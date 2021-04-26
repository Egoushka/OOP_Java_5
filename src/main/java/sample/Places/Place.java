package sample.Places;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Animals.Animal;
import sample.PlaceBehaviors.Behavior;
import java.util.ArrayList;

public abstract class Place {

    int id;
    String name;
    Integer placeCapacity;
    Behavior behavior;
    ArrayList<Animal> animals = new ArrayList<>();

    public Integer getPlaceCapacity() {
        return placeCapacity;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public Place(Integer placeCapacity, Behavior behavior,String name) {
        this.placeCapacity = placeCapacity;
        this.behavior = behavior;
        this.name = name;
    }

    public void addNewAnimal(Animal animal) {
        if (addCheck(animal))
            animals.add(animal);
    }

    public void showAllAnimal(){
        for (var item : animals) {
            System.out.println(item.toString());
        }
    }

    @Override
    public String toString() {
        return name;
    }

    private boolean addCheck(Animal animal){
        if(animals.size()+1 > placeCapacity) {
            System.out.println("Overflow");
            return false;
        }
        for (var item : behavior.behaviors) {
            if(item.equals(animal.getBehavior())){
                System.out.println("Successful");
                return true;
            }
        }

        System.out.println("You tried to add animal with another behavior");
        return false;
    }
}
