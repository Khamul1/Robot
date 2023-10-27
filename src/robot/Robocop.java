package robot;

public class Robocop implements IRobot{

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void fight() {
        System.out.println("flight");
    }
}
