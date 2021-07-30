package com.automobile;

import com.automobile.FourWheeler.Ford;
import com.automobile.FourWheeler.Logan;

public class TestFourWheeler {
    public static void main(String[] args) {
        Logan logan = new Logan("Mahindra Logan", "DL3SAW1234", "Vinay Verma", 156);
        System.out.println(logan.getModelName());
        System.out.println(logan.getOwnerName());
        System.out.println(logan.getRegistrationNumber());
        System.out.println(logan.getSpeed() + " kmph");
        logan.gps();

        System.out.println();

        Ford ford = new Ford("Ford Endeavour", "DL3CAW9988", "Ramkrishan", 180);
        System.out.println(ford.getModelName());
        System.out.println(ford.getOwnerName());
        System.out.println(ford.getRegistrationNumber());
        System.out.println(ford.getSpeed() + " kmph");
        ford.tempControl();

        System.out.println();
    }
}
