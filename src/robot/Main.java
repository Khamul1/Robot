package robot;

public class Main {
    public static void main(String[] args) {

        IRobot robocop = new Robocop();

        ((Robocop)robocop).takeGun(); // 1-й вариант приведения без присвоения в переенную

        Robocop robocopTrue = (Robocop)robocop; // 2-й вариант приведения с присвоением в переменную
        robocopTrue.takeGun();




    }
}