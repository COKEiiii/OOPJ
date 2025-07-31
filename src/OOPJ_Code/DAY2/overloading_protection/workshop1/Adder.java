package OOPJ_Code.DAY2.overloading_protection.workshop1;

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
    public Color add(Color a, Color b) {
        if (a.getColor().equals("red") && b.getColor().equals("blue")
        || a.getColor().equals("blue") && b.getColor().equals("red")
        ) {
            return new Color("magenta");
        } else if (a.getColor().equals("red") && b.getColor().equals("green")
        || a.getColor().equals("green") && b.getColor().equals("red")) {
            return new Color("yellow");
        }else if (a.getColor().equals("blue") && b.getColor().equals("green")
        || a.getColor().equals("green") && b.getColor().equals("blue")) {
            return new Color("cyan");
        }else if (a.getColor().equals(b.getColor())){
            return a;
        }
        else{
            return null;
        }
    }

    }

