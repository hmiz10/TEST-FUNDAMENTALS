package be.intecbrussel.Robot;

public class BendingRobot extends Robot {
     private double maxBendAngle;

    public BendingRobot(double maxBendAngle, String unitName) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double bend){
       double maxBendAngle = 360;

        if(bend > maxBendAngle || bend == 0){
            System.out.println("bending is not possible...");
        } else {
            System.out.println("The robot is bending on an angle of " + bend + "°");
        }
     }
}
