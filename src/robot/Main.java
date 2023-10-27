package robot;

public class Main {
    public static void main(String[] args) {

        Robocop robocop = new Robocop();
        robocop.setName("robo");
        robocop.fight();
        System.out.println(robocop.getName());

    }
}