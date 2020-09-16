package be.intecbrussel.Animals;

public class AnimalApp {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        Animal animal = new Animal(20, "AmericanStaff", 1);
        Animal animal1 = new Animal(5, "Persan", 2);
        Animal animal2 = new Animal(6, "British Shorthair", 3);
        Animal animal3 = new Animal(10, "Ragdoll", 4);
        Animal animal4 = new Animal(13, "Labrador", 5);
        Animal animal5 = new Animal(6, "Teckel", 6);
        Animal animal6 = new Animal(5, "Beagle", 7);
        Animal animal7 = new Animal(36, "Gibbon", 8);
        Animal animal8 = new Animal(24, "Howler", 9);
        Animal animal9 = new Animal(22, "Japanese Macaque", 10);

        Animal[] animals = {animal,animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8, animal9};

        animalShelter.findOldestAnimal();
        animalShelter.countAnimals();
        animalShelter.sortAnimalsByAge();
        animalShelter.printAnimalsIsNotVaccinated();
        animalShelter.treatAllAnimals();
    }
}
