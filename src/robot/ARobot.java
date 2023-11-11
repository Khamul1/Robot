package robot;

public abstract class ARobot implements IRobot {

    public ARobot() {
    }
    // можем выносить в абстрактный класс часть реализации интерфейса


    public ARobot(String name, Wing wing) {
        this.name = name;
        this.wing = wing;
    }

    private String name;
    private Wing wing;

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

    @Override
    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }
}
