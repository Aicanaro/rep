package WhyNot;

public class LifeCycle {
    public static int counter = 0;
    public int x = 10;
    static{
        System.err.println("Static Field");
        int stValue = 10;
        System.err.println(stValue);
    }
    {
        System.err.println("Instance Field");
        int value = 10;
        System.err.println(value);
        x = 0;
        System.err.println(x);
    }
    public LifeCycle() {
        System.err.println("New Instance");
        System.err.println(counter);
        System.err.println(x);
    }
}
