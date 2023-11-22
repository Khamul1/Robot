package robot;

public interface ITechnics {

    default  void on(){
        System.out.println("default on");
    }

    default  void off(){
        System.out.println("default off");
        on();
    }
}
