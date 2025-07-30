package OOPJ_Code.DAY2.overloading_protection.b;

public class Program {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("Calling first overloaded method...");
        System.out.printf("Result: %d.\n", adder.add(1, 2));

        System.out.println("Calling second overloaded method...");
        System.out.printf("Result: %s\n", adder.add("Hello", " World!"));
    }
}
