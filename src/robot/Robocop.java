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
        getIWing().open();
        System.out.println("robocop fly");
    }


    @Override
    public void talk() {
        System.out.println("robo talk");
    }

    @Override
    public void on() {
        System.out.println("on with beep");
    }
    // этот метод не описан в интерфейсе
    public void takeGun(){
        System.out.println("robocop take gun");
    }

    public void takeGun(int sec){
        System.out.println("robocop take gun in "+ sec+ "sec");
    }

    public void takeGun(int sec, String speech){
        System.out.println("robocop take gun in " + sec + " sec with speech="+ speech);
    }
}
