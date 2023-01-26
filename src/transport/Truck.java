package transport;

import enums.LoadCapasity;

public class Truck extends Transport implements Competing{

    private LoadCapasity loadCapasity;

    public Truck(String brand, String model, double engineVolume, LoadCapasity loadCapasity) {
        super(brand, model, engineVolume);
        this.loadCapasity = loadCapasity;
    }
    @Override
    public void startMoving() {
        System.out.println("Truck " + getBrand() + getModel() + " started moving");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Truck " + getBrand() + getModel() + " has stopped");
    }
    @Override
    public void pitStop() {
        System.out.println("Truck " + getBrand() + getModel() + " fulfilled pit-stop");
    }
    @Override
    public void bestTime() {
        System.out.println("Truck " + getBrand() + getModel() + " done bestTime");
    }
    @Override
    public void maxSpeed(){
        System.out.println("Truck " + getBrand() + getModel() + " done bestTime");}



    public String toString() {
        return  "бренд " + getBrand()
                + "\nмодель " + getModel()
                + "\nобъем двигателя " + getEngineVolume()
                + "\n" + loadCapasity;
    }

}
