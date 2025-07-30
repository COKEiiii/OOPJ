package OOPJ_Code.DAY2.access_modifier.c.numbers;

public class MyPositiveNumber extends MyNumber {
    public void setPositiveValue(int var1) {
        if (var1 > 0) {
            this.setValue(var1);
        }

    }

    public int getPositiveValue() {
        return this.getValue();
    }
}
