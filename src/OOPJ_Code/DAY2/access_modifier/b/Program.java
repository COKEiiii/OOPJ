package OOPJ_Code.DAY2.access_modifier.b;

public class Program {
    public static void main(String[] var0) {
        MyClass var1 = new MyClass(10);
        System.out.print("Read instance-variable using a Public method. ");
        System.out.printf("Count = %d.\n", var1.GetCount());
        var1.SetCount(0);
//        var1.Reset(); private
        System.out.println("Wrote to instance-variable using a Public method.");
        System.out.print("Reading instance-variable using a Public method. ");
        System.out.printf("Count = %d.\n", var1.GetCount());
    }
}
