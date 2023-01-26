package transport;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void pitStop() {
        System.out.println("At a pit stop");
    }

    public void bestTime(){
        System.out.println("Best time");
    }

    public void maxSpeed() {
        System.out.println("max speed");
    }

    public void startMoving() {
    }

    public void finishTheMove() {

    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

}
