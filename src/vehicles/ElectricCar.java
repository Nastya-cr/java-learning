package vehicles;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar() {
        engineType = "Electric";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

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

