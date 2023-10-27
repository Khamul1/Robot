package robot;

public class Terminator implements IRobot {

    @Override
    public void move() {
        System.out.println("terminator move");
    }

    @Override
    public void stop() {
        System.out.println("terminator stop");

    }

    @Override
    public void fight() {
        System.out.println("terminator flight");

    }
}
