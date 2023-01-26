import data.Data;
import drivers.DDriver;
import drivers.Driver;
import enums.Kuzov;
import enums.LoadCapasity;
import enums.NumberOfSeats;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        Car honda = new Car("Honda", "Accord", 3.5,Kuzov.SEDAN);
        System.out.println(honda);
        Car lada = new Car("Lada","vesta",1.8,Kuzov.SEDAN);
        System.out.println(lada);
        Car bmv = new Car("BMV","x5",3.3,Kuzov.COUPE);
        System.out.println(bmv);
        Car audi = new Car("Audi", "A8",4.0,Kuzov.FURGON);
        System.out.println(audi);
        System.out.println();
        System.out.println();

        NumberOfSeats numberOfSeats = NumberOfSeats.VERY_BIG;
        Bus liaz = new Bus("Лиаз","Эг-17",3.0,numberOfSeats);
        System.out.println(liaz);
        Bus ikarus = new Bus("Ikarus","281",5.0, NumberOfSeats.FEW);
        System.out.println(ikarus);
        Bus fav = new Bus("Fav","Q-21",7.0, numberOfSeats);
        System.out.println(fav);
        Bus foton = new Bus("Foton", "Sky", 8.0, NumberOfSeats.VERY_LITTLE);
        System.out.println(foton);
        System.out.println();
        System.out.println();

        Truck tatra = new Truck("Tatra", "Elephant", 5.5,LoadCapasity.N1);
        System.out.println(tatra);
        Truck kamaz = new Truck("Kamaz","Mamont",5.5, LoadCapasity.N2);
        System.out.println(kamaz);
        Truck daf = new Truck("Daf","LF",6.0, LoadCapasity.N2);
        System.out.println(daf);
        Truck man= new Truck("Man","f2000",7.5, LoadCapasity.N2);
        System.out.println(man);

        Driver<Car> ivan = new Driver<>("Ivan", "B", 10, audi);
        ivan.drive();
        Driver<Bus> alex = new Driver<>("Alex", "C", 15, ikarus);
        alex.drive();
        DDriver denis = new DDriver("Denis", "D", 10, daf);

        audi.setKuzov(Kuzov.SEDAN);

        System.out.println(audi.getKuzov());



        audi.setKuzov(Kuzov.SEDAN);

        System.out.println(audi.getKuzov());

        try {
            System.out.println(Data.checkPassword("", "Andrei123", "Andrei123"));
        } catch (Exception e) {
            System.out.println(e);;
        }


    }
}