package Vehicle;

public class Helicopter extends Airplane {

    public Helicopter(String brandName, FuelType fuelType, Status status) {
        super(brandName, fuelType, status);
    }

    public void verticalFlighting() {
        System.out.println("Flighting vertically");
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void flighting() {
        super.flighting();
    }
}
