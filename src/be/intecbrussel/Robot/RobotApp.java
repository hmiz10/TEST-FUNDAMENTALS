package be.intecbrussel.Robot;

public class RobotApp {
    public static void main(String[] args) {

        BendingRobot bendingRobot = new BendingRobot(360, "Transporter");
        LiftingRobot liftingRobot = new LiftingRobot(90, "Robotcop");

        bendingRobot.bend(50);
        bendingRobot.bend(0);

        liftingRobot.lift(60);
        liftingRobot.lift(150);

    }
}
