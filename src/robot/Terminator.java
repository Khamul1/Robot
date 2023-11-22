package robot;

import java.util.Stack;

public class Terminator extends ARobot {

    public Terminator() {
    }

    public Terminator(String name, robot.IWing IWing) {
        super(name, IWing);
    }

//    @Override
//    public void move() {
//        System.out.println("terminator move");
//    }

    @Override
    public void stop() {
        System.out.println("terminator stop");

    }

    @Override
    public void fight() {
        System.out.println("terminator flight");

    }

    @Override
    public void talk() {
        System.out.println("terminator talk");
    }
}
