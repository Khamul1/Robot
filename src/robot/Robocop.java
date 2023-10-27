package robot;

public class Robocop extends ARobot{

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
