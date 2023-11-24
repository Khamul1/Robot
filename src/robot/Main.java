package robot;

public class Main {
    public static void main(String[] args) {

        IRobot robocop = new Robocop();

        ((Robocop)robocop).takeGun(10, "hi"); // 1-й вариант приведения без присвоения в переменную


        ((Robocop) robocop).setName("robo");
        System.out.println("robocop = "+ robocop);






    }
}