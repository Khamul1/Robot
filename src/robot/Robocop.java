package robot;

public class Robocop extends ARobot{

    public Robocop() {
    }

    public Robocop(String name) {
        super(name);
    }

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


    @Override
    public void talk() {
        System.out.println("robo talk");
    }
}
