package robot;

public class Main {
    public static void main(String[] args) {

       Robocop robocop1 = new Robocop();
       robocop1.takeGun();

       IRobot robocop2 = new Robocop();
       robocop2.talk();
    }
}