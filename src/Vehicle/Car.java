package Vehicle;

public class Car extends Vehicle {
    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Car(String brandName, FuelType fuelType, BodyType bodyType) {
        super(brandName, fuelType);
        this.bodyType = bodyType;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }
}
