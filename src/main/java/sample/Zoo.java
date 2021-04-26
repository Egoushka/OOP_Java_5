package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Animals.Fish;
import sample.Behaviors.Behaviors;
import sample.PlaceBehaviors.Predator;
import sample.Places.Aquarium;
import sample.Places.Place;

import java.util.ArrayList;

public class Zoo {
     ArrayList<Place> places;
    {
        places = new ArrayList<Place>();
        places.add(new Aquarium(10, new Predator(), "aboba"));
        places.add(new Aquarium(10, new Predator(), "beboba"));
        places.get(0).addNewAnimal(new Fish( Behaviors.Predator.getId(), 10, "Bitch"));
        places.get(0).addNewAnimal(new Fish( Behaviors.Predator.getId(), 10, "Bitch1"));

        places.get(1).addNewAnimal(new Fish( Behaviors.Predator.getId(), 10, "Whore"));
        places.get(1).addNewAnimal(new Fish( Behaviors.Predator.getId(), 10, "Flat"));  }

    int calculateAllAnimalsFoodExpenses(){
        int result = 0;
        for (var place : places) {
            for (var animal : place.getAnimals()) {
                result += animal.getCost();
            }
        }
        return result;
    }

}
