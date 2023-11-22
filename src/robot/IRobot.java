package robot;

//контракт для всех работа
public interface IRobot{

    // методы-действия (методы бизнес-процессов)
    default void move(){
        System.out.println("default move " + getName());
    }

    void  stop();
    void fight();
    void talk();

    // методы-свойства
    String getName();
    IWing getIWing();


}
