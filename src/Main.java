import Vehicle.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", FuelType.Gasoline, BodyType.coupe);
        Car car2 = new Car("BMW", FuelType.Diesel, BodyType.sedan);
        Car car3 = new Car("Audi", FuelType.Gasoline, BodyType.suv);

        Airplane airplane1 = new Airplane("Boeing", FuelType.Gasoline, Status.boarding);
        Airplane airplane2 = new Airplane("Airbus", FuelType.Diesel, Status.delayed);
        Airplane airplane3 = new Airplane("Boeing", FuelType.Gasoline, Status.onTime);

        Parking parking = new Parking(new Car[]{car1, car2, car3});

        Helicopter helicopter1 = new Helicopter("Bell",FuelType.WhiteGasoline, Status.onTime);
        Helicopter helicopter2 = new Helicopter("AB",FuelType.Diesel, Status.onTime);

        Airport airport = new Airport(new Airplane[]{airplane1, airplane2, airplane3},new Helicopter[]{helicopter1,helicopter2},parking);

    }
}