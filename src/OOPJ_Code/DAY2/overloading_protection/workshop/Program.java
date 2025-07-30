package OOPJ_Code.DAY2.overloading_protection.workshop;

public class Program {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("Adding 2 integers...");
        System.out.printf("After adding:%d\n\n",adder.add(1,2));

        System.out.println("Concatenating 2 Strings...");
        System.out.printf("After concatenating:%s\n\n",adder.add("Hello"," World!"));

        System.out.println("Mixing 2 colors...");
        Color red = new Color("red");
        Color blue = new Color("blue");
        Color mix =  adder.add(blue,red);
        System.out.printf("After mixing:%s\n",
                (mix != null ? mix.getColor() : "unknown"));
    }
}
