package vehicles;

public class Car extends Vehicle {

    public Car() {
    }

    public Car(String model, String license, String color, int year) {
        setModel(model);
        setLicense(license);
        setColor(color);
        setYear(year);
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


