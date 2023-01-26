package drivers;

import transport.Competing;
import transport.Transport;

public class Driver<T extends Transport & Competing> {
    private final String fio;
    private final String license; //  наличие прав
    private final int exp;       // стаж
    private final T CAR;


    public Driver(String fio, String license, int exp, T car) {
        this.fio = fio;
        this.license = license;
        this.exp = exp;
        this.CAR = car;
    }

    public void move() {
        System.out.println("Driver moving");
    }

    public void drive() {
        System.out.println("Driver driving " + CAR.getBrand());
    }

    public void startMoving() {
        System.out.println("The driver started moving");
    }
    public void stopMovement() {
        System.out.println("The driver stopped");
    }

    public void refuelTheCar() {
        System.out.println("driver refueled");
    }

    public String getFio() {
        return fio;
    }

    public String getLicense() {
        return license;
    }

    public int getExp() {
        return exp;
    }


    @Override
    public String toString() {
        return "Водитель " + getFio()
                + "\n управляет автомобилем " + CAR.getBrand() + CAR.getModel()
                + "\n лицензия " + getLicense()
                + "\n стаж" + getExp()
                + "\n будет участвовать в заезде ";
    }
}
