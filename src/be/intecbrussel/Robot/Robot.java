package be.intecbrussel.Robot;

public abstract class Robot {

    private String unitName;

    public Robot(String namelessRobot) {
        this.unitName = namelessRobot;
    }

    public void boot(){
        System.out.println("Robot is starting..." + unitName);
    }

    public String getUnitName(){
        return unitName;
    }
}
