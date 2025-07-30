package OOPJ_Code.DAY2.access_modifier.c.numbers;

public class MyNumber {
    private int n;

    protected void setValue(int var1) {
        this.n = var1;
    }

    protected int getValue() {
        return this.n;
    }
}
