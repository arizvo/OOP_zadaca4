package com.aldinrizvo.qamp.oophomework4.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Fish nemo = new Fish();
        final Plane antonov = new Plane();
        final Duck donaldDuck = new Duck();
        final Pegasus unicorn = new Pegasus();
        final Submarine nautilus = new Submarine();

        final List<Flight> canFlyList = new ArrayList<>();
        canFlyList.add(antonov);
        canFlyList.add(donaldDuck);
        canFlyList.add(unicorn);

        final List<Swim> canSwimList = new LinkedList<>();
        canSwimList.add(nemo);
        canSwimList.add(donaldDuck);
        canSwimList.add(nautilus);

        for (final Flight flyer : canFlyList) {
            System.out.println(flyer.fly());
        }

        System.out.println();

        for (final Swim swimmer : canSwimList) {
            System.out.println(swimmer.swim());
        }
    }
}
