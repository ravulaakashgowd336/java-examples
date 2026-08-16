package com.polymorphism;

class AirPlane {
    void fly() {
        System.out.println("Air Plane is flying");
    }
}

class CargoPlane extends AirPlane {
    void fly() {
        System.out.println("CargoPlane is flying at low heights");
    }
}

class PassengerPlane extends AirPlane {
    void fly() {
        System.out.println("PassengerPlane is flying at medium heights");
    }
}

class FighterPlane extends AirPlane {
    void fly() {
        System.out.println("FighterPlane is flying at high heights");
    }
}

public class plane {
    public static void main(String[] args) {

        AirPlane p;

        p = new CargoPlane();
        p.fly();

        p = new PassengerPlane();
        p.fly();

        p = new FighterPlane();
        p.fly();
    }
}
