package robot;

public class Main {
    public static void main(String[] args) {

        AircraftWing aircraftWing = new AircraftWing();
        aircraftWing.setSize(200);

        LittleWing littleWing = new LittleWing();
        aircraftWing.setSize(10);

        Robocop robocop = new Robocop();
        robocop.setName("robo");
        robocop.setIWing(littleWing);

        robocop.fight();
    }
}