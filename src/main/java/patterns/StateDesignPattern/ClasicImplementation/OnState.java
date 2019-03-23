package patterns.StateDesignPattern.ClasicImplementation;

public class OnState extends State {

    public OnState() {
        System.out.println("Light turned on");
    }

    @Override
    void off(LightSwitch ls) {
        System.out.println("Switch light off..");
        ls.setState(new OffState());
    }
}
