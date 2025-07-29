package OOPJ_Code.DAY1.ThisKeyWord;

public class This {
    // instance variable
    private String name = "This";

    public void method1() {
        // local variable
        String name = "method1";

        // using local variable
        System.out.println("name = " + name);
    }

    public void method2() {
        // using instance variable
        String name = "method1";
        System.out.println("name = " + this.name);
    }
}
