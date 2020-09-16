package be.intecbrussel.Animals;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class AnimalShelter {

    private List<Animal> animals;
    private int animalId;

    public AnimalShelter(List<Animal> animals) {
        this.animals = animals;
    }

    public void printAnimals(){
        for (Animal a : animals){
            System.out.println(a);
        }
    }

    public void sortAnimals(int animalNumber){
        animals.sort(Comparator.comparing(animalNumber));
    }

    public void sortAnimalsByName(){
    animals.sort(Comparator.comparing(e -> e.getName()));
    }

    public void sortAnimalsByAge(){
        animals.sort(Comparator.comparing(e -> getAge()));
    }

    public void printAnimalsIsNotVaccinated(Disease disease){
        Stream.of(animals).forEach(printAnimalsIsNotVaccinated(disease);
    }

    public Animal findAnimal(int animalId){
        return animals.get(animalId);
    }

    public Animal findAnimal(String animal){
        return animals.contains(animal);
    }

    public void treatAnimal(int animalId){
        Stream.of(animals).forEach(treatAnimal(animalId);
    }

    public void treatAnimal(String animal){
        Stream.of(animals).forEach(treatAnimal(animal);
    }

    public void treatAllAnimals(Animal animal){
        Stream.of(animals).forEach(treatAllAnimals(animal);
    }

    public Animal findOldestAnimal(){
        return animals.stream().findFirst(findOldestAnimal(getAge());
    }

    public int countAnimals(){
        return (int) animals.stream().count();
    }
}
