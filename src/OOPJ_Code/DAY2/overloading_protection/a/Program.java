package OOPJ_Code.DAY2.overloading_protection.a;

public class Program {
    public static void main(String[] args) {

        System.out.println("Object created with first constructor...");
        // first constructor will be invoked
        MyClass c1 = new MyClass();
        System.out.printf("Sum = %d.\n", c1.getSum());


        System.out.println("\nObject created with second constructor...");
        // second constructor will be invoked
        MyClass c2 = new MyClass(1, 2);
        System.out.printf("Sum = %d.\n", c2.getSum());
    }
}
