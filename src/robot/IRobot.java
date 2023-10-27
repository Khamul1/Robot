package robot;

//контракт для всех работа
public interface IRobot {

    // только описание поведение для всех работов
    void move();
    void  stop();
    void fight();

    String name = "asdsad";
}
