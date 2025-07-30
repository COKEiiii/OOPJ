package OOPJ_Code.DAY2.overloading_protection.a;

public class MyClass {
    private int n1, n2;

    // first constructor (has no parameters)
    public MyClass() {
        // use default values
        n1 = n2 = 0;
    }

    // second constructor (has two parameters)
    public MyClass(int n1, int n2) {
        // use values passed in by caller
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getSum() {
        return n1 + n2;
    }
}
