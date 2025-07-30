package OOPJ_Code.DAY2.access_modifier.c.main;
import OOPJ_Code.DAY2.access_modifier.c.numbers.MyPositiveNumber;

public class Program {
    public static void main(String[] var0) {
        MyPositiveNumber var1 = new MyPositiveNumber();
        System.out.println("Setting value to 10.");
        var1.setPositiveValue(10);
        System.out.println("Setting value to -10.");
        var1.setPositiveValue(-10);
        System.out.println("Retrieving value...");
        System.out.printf("Value: %d.\n", var1.getPositiveValue());

    }
}
