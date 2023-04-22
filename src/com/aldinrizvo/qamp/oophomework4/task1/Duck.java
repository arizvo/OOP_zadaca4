package com.aldinrizvo.qamp.oophomework4.task1;

public class Duck implements Swim, Flight {
    @Override
    public String swim() {
        return "Kinda floats";
    }

    @Override
    public String fly() {
        return "Flies with wings";
    }
}
