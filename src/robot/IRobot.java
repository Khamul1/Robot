package robot;

//контракт для всех работа
public interface IRobot extends ITechnics {

    // методы-действия (методы бизнес-процессов)
    void move();
    void  stop();
    void fight();
    void talk();

    // методы-свойства
    String getName();
    IWing getIWing();


}
