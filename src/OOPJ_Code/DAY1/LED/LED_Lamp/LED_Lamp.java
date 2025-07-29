package OOPJ_Code.DAY1.LED.LED_Lamp;

import OOPJ_Code.DAY1.LED.LED;

public class LED_Lamp {
    private LED red, green, blue;

    public LED_Lamp() {
        red = new LED("red");
        green = new LED("green");
        blue = new LED("blue");
    }

    public void showLight(int lightIdx) {
        if(red.isLEDOn() || green.isLEDOn() || blue.isLEDOn()) {
            red.turnOff();
            green.turnOff();
            blue.turnOff();
        }
            if (lightIdx == 0) {
                    red.turnOn();
                    System.out.println(red.color+" LED ON");
                    }
                 else if (lightIdx == 1) {
                        green.turnOn();
                        System.out.println(green.color+" LED ON");
                        }
                     else if (lightIdx == 2) {
                            blue.turnOn();
                            System.out.println(blue.color+" LED ON");
                            }
                        else {
                            System.out.println("error:Expect 0,1 or 2");
                        }
                }
            }