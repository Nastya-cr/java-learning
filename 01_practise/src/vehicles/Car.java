package vehicles;

public class Car extends Vehicle {

    public Car() {
        engineType = "Combustion";
    }

    public Car(String model, String license, String color, int year) {
        setModel(model);
        setLicense(license);
        setColor(color);
        setYear(year);
        engineType = "Combustion";
    }

    @Override
    public String vehicleType() {
        return "Car";
    }

    @Override
    public String toString() {
        return getModel() + " " +
                getLicense() + " " +
                getColor() + " " +
                getYear() + " " +
                getOwnerName() + " " +
                getInsuranceNumber() + " " +
                getEngineType();
    }
}


