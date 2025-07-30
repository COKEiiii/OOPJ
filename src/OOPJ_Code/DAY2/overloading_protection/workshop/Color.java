package OOPJ_Code.DAY2.overloading_protection.workshop;

public class Color {
    private String color;
    public Color(String color) {
        this.color = color;
    }
    String getColor() {
//        this.color = color;
        return this.color;
    }

}
