package OOPJ_Code.DAY1.Proximity;

public class Proximity {
    // instance variable
    private String name = "Proximity";

    public void method1() {
        // local variable
        String name = "method1";

        // using local variable
        System.out.println("name = " + name);
    }

    public void method2() {
        // using instance variable
        System.out.println("name = " + name);
    }
}
