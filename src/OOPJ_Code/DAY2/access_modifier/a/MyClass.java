package OOPJ_Code.DAY2.access_modifier.a;

public class MyClass {
    public int count;

    public MyClass(int var1) {
        this.count = var1;
    }//parameter constructor

    public int GetCount() {
        return this.count;
    }
}