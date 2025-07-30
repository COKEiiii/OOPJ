package OOPJ_Code.DAY2.overloading_protection.b;

public class Adder {
    // overloading for integer addition
    public long add(int a, int b) {
        // add two integers
        return a + b;
    }

    // overloading for string concatenation
    public String add(String a, String b) {
        // concatenate two strings
        return a.concat(b);
    }
}
