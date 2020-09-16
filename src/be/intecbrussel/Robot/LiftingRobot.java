package be.intecbrussel.Robot;

public class LiftingRobot extends Robot {
    private double maxLiftHeight;


    public LiftingRobot(double maxLiftHeight, String unitName) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    public void lift(double lift){
        if( lift > maxLiftHeight){
            System.out.println("Lifting is not possible...");
        } else {
            System.out.println("Lifting is done...");
        }
    }
}
