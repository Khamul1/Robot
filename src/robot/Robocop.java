package robot;

public class Robocop extends ARobot{

    public Robocop() {
    }

    public Robocop(String name, robot.IWing IWing) {
        super(name, IWing);
    }

    @Override
    public void move() {
        System.out.println("Robocop move");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void fight() {
        System.out.println("Robocop flight with wing size = " + getIWing().getSize());
    }


    @Override
    public void talk() {
        System.out.println("robo talk");
    }

    @Override
    public void on() {
        System.out.println("on with beep");
    }
}
