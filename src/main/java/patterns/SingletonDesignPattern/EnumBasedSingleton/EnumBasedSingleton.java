package patterns.SingletonDesignPattern.EnumBasedSingleton;

public enum EnumBasedSingleton {

    INSTANCE;

    EnumBasedSingleton() {
        value = 43;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
