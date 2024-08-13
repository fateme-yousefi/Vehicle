import Vehicle.Car;

public class Parking implements ParkingCars{
    private Car cars[];

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Parking(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public void parking() {
        System.out.println("Park the cars");
    }
}
