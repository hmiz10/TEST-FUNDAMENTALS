package be.intecbrussel.Animals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Vaccinateable, Treatable{

    private Map<Disease, Boolean> isVaccinated;
    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;


    public Animal( int age, String name, int animalNumber) {
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }
}
