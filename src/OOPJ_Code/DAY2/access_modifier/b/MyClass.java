package OOPJ_Code.DAY2.access_modifier.b;

public class MyClass {
    private int count;

    public MyClass(int var1) {
        this.count = var1;
    }

    public int GetCount() {
        return this.count;
    }

    public void SetCount(int var1) {
        if (var1 == 0) {
            this.Reset();
        } else {
            this.count = var1;
        }

    }

    private void Reset() {
        this.count = 0;
    }
}
