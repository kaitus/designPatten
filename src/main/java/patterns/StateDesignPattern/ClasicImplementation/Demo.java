package patterns.StateDesignPattern.ClasicImplementation;

public class Demo {

    public static void main(String[] args) {
        LightSwitch lightSwitch = new LightSwitch();
        lightSwitch.on();
        lightSwitch.on();
        lightSwitch.off();
        lightSwitch.off();
    }
}
