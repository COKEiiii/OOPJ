package OOPJ_Code.DAY1.scope_class;

public class Scope {
    // instance variables
    private String name = "Scope";
    private int temp = 0;
    public void method1() {
        // local variable
        int x = 10;
        temp += x;
        // "x" is only visible to method1
        System.out.println("x = " + x);

        // "name" is visible to method1
        System.out.println("name = " + name);
    }

    public void method2() {
        // local variable
        int y = 20;
        temp += y;
        // "y" is only visible to method2
        System.out.println("y = " + y);

        // "name" is visible to method2
        System.out.println("name = " + name);

        String name ="SCOPE";
        System.out.println("name = " + name);
        System.out.println("temp = " + temp);
    }
}

