package robot;

public abstract class ARobot implements IRobot, ITechnics {

    public ARobot() {
    }

    public ARobot(String name, robot.IWing IWing) {
        this.name = name;
        this.IWing = IWing;
    }
    // можем выносить в абстрактный класс часть реализации интерфейса
    private String name; // эту переменную создали согласно интерфейсу
    private IWing IWing; // универсальная ссылка


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public robot.IWing getIWing() {
        return IWing;
    }

    public void setIWing(robot.IWing IWing) {
        this.IWing = IWing;
    }

    @Override
    public void on() {
        System.out.println("on");
    }

//    @Override
//    public void off() {
//        System.out.println("off");
//    }

}
