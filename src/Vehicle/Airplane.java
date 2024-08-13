package Vehicle;

public class Airplane extends Vehicle {
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void flighting() {
        System.out.println("flighting");
    }

    public Airplane(String brandName, FuelType fuelType, Status status) {
        super(brandName, fuelType);
        this.status = status;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }
}
