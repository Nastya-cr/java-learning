package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {

    private int batteryCapacity;

    public ElectricCar() {
        engineType = "Electric";
    }
    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    @Override
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return super.toString() + " " + batteryCapacity;
    }
}

