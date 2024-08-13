import Vehicle.Airplane;
import Vehicle.Helicopter;

public class Airport {
    private Airplane airplanes[];
    private Helicopter helicopters[];
    private Parking parking;

    public Airplane[] getAirplanes() {
        return airplanes;
    }

    public Helicopter[] getHelicopters() {
        return helicopters;
    }

    public Parking getParking() {
        return parking;
    }

    public void setAirplanes(Airplane[] airplanes) {
        this.airplanes = airplanes;
    }

    public void setHelicopters(Helicopter[] helicopters) {
        this.helicopters = helicopters;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public Airport(Airplane[] airplanes, Helicopter[] helicopters, Parking parking) {
        this.airplanes = airplanes;
        this.helicopters = helicopters;
        this.parking = parking;
    }
}
