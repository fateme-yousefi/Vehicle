package Vehicle;

public abstract class Vehicle {
    private String brandName;
    private FuelType fuelType;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void startEngine() {
        System.out.println("Starting Engine");
    }

    public void drive() {
        System.out.println("Driving!!!");
    }

    public Vehicle(String brandName, FuelType fuelType) {
        this.brandName = brandName;
        this.fuelType = fuelType;
    }
}

