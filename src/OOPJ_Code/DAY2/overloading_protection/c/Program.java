package OOPJ_Code.DAY2.overloading_protection.c;

public class Program {
//    int x;
//    public Program(int x) {
//        this.x = x;
//    }
    public static void main(String[] args) {
//        Program p = new Program(5);
//        p.x = 1;
//        System.out.println(p.x);
        int x = 0;

        System.out.printf("In Main(), x = %d\n", x);

        // passing x by value to get it incremented
        IncPassByVal(x);

        // Main did not see the changes made to x
        System.out.printf("In Main(), x = %d\n", x);
    }

    static void IncPassByVal(int x) {
        System.out.println("In IncPassByVal()");
        System.out.printf("-- Before increment, x = %d\n", x);
        x++;
        System.out.printf("-- After increment, x = %d\n", x);
    }
}

