package OOPJ_Code.DAY2.overloading_protection.d;

public class Program {
    public static void main(String[] args) {

        MyNumber num = new MyNumber(10);
        System.out.printf("In Main, before increment n = %d.\n", num.n);

        // objects are passed by referece
        Increment(num);

        // Main can see the changes made
        System.out.printf("In Main, after increment n = %d.\n", num.n);
    }

    static void Increment(MyNumber o) {
        // modify object's value
        o.n++;
        o = new MyNumber(20);//local variable 重新在memory中建立一块区域（a new object）

    }
}
