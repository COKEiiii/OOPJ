package OOPJ_Code.DAY2.access_modifier.a;

public class Program {
    public static void main(String[] var0) {
        MyClass var1 = new MyClass(10);
        System.out.print("Read from Public instance-variable. ");
        System.out.printf("Count = %d.\n", var1.count);
        System.out.println("Wrote to Public instance-variable.");
        System.out.print("Read with Public method. ");
        System.out.printf("Count = %d.\n", var1.GetCount());
    }
}
