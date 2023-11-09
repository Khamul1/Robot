package robot;

public abstract class ARobot implements IRobot {

    public ARobot() {
    }
    // можем выносить в абстрактный класс часть реализации интерфейса
    private String name;

    public ARobot(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void talk(){
    }

}
