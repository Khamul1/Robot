package robot;

import java.util.Stack;

public class Terminator implements IRobot {

    private String name;
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

    @Override
    public String getName() {
        return name;
    }
}
