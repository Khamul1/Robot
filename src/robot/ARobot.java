package robot;

public abstract class ARobot implements IRobot {

    // можем выносить в абстрактный класс часть реализации интерфейса
    private String name;

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
