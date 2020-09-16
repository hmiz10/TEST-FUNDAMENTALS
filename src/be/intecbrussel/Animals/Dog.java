package be.intecbrussel.Animals;

public class Dog extends Animal{

    private boolean hasFoulBreath;

    public Dog(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {

    }

    @Override
    public void vaccinateAnimal(Disease disease) {

    }
}
