package OOPJ_Code.DAY1.LED_Lamp;

import OOPJ_Code.DAY1.LED.LED;

public class LED_Lamp {
    private LED red, green, blue;

    public LED_Lamp() {
        red = new LED("red");
        green = new LED("green");
        blue = new LED("blue");
    }

    public boolean showLight(int lightIdx) {
        if (lightIdx == 0) {
            if(!red.isLEDOn()){
                red.turnOn();
                System.out.println("red LED ON");
                return  true;
            }else{
                System.out.println("red LED is already ON");
                return true;}
        }else if(lightIdx == 1) {
            if(!green.isLEDOn()){
                green.turnOn();
                System.out.println("green LED ON");
                return  true;
            }else {
                System.out.println("green LED is already ON");
                return true;
            }
        }else if(lightIdx == 2) {
            if(!blue.isLEDOn()){
                blue.turnOn();
                System.out.println("blue LED ON");
                return  true;
            }else  {
                System.out.println("blue LED is already ON");
                return true;
            }
        }else {
            System.out.println("error:Expect 0,1 or 2");
            return false;}

        }
    }
