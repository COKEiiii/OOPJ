package OOPJ_Code.DAY1.LED;

public class Program {
    public static void main(String[] args) {
        // instantiate a new LED object (from the LED class)
        // and set its color to red
        LED redLED = new LED("red");

        // get the current color of our LED object
        System.out.println("LED Color: " + redLED.getColor());

        // turn ON the LED object
        redLED.turnOn();
        System.out.println("LED is " + (redLED.isLEDOn() ? "ON" : "OFF"));

        // turn OFF the LED object
        redLED.turnOff();
        System.out.println("LED is " + (redLED.isLEDOn() ? "ON" : "OFF"));
    }
}
