package robot;

public class Robocop implements IRobot{

    private String name;

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
