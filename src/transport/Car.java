package transport;

import enums.Kuzov;

public class Car extends Transport implements Competing{


    private Kuzov kuzov;


    public Car(String brand, String model, double engineVolume,Kuzov kuzov) {
        super(brand,model,engineVolume);
        this.kuzov = kuzov;
    }
    public String toString() {
        return  "бренд " + getBrand()
                + "\nмодель " + getModel()
                + "\nобъем двигателя " + getEngineVolume();
    }

    public Kuzov getKuzov() {
        return kuzov;
    }

    public void setKuzov(Kuzov kuzov) {
        this.kuzov = kuzov;
    }

    @Override
    public void startMoving() {
        System.out.println("Car " + getBrand() + getModel() + " started moving");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Car " + getBrand() + getModel() + " has stopped");
    }
    @Override
    public void pitStop() {
        System.out.println("Car " + getBrand() + getModel() + " fulfilled pit-stop");
    }
    @Override
    public void bestTime() {
        System.out.println("Car " + getBrand() + getModel() + " done bestTime");
    }
    @Override
    public void maxSpeed(){
        System.out.println("Car " + getBrand() + getModel() + " done bestTime");}






}

