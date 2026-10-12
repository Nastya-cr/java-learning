package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {

        Car car = new Car();

        car.setModel("BMW");
        car.setLicense("A207PM");
        car.setColor("Black");
        car.setYear(2007);
        car.setOwnerName("Anna");
        car.setInsuranceNumber(12345);
        car.setEngineType("Petrol");

        ElectricCar electricCar = new ElectricCar();

        electricCar.setModel("Tesla");
        electricCar.setLicense("E777AA");
        electricCar.setColor("White");
        electricCar.setYear(2024);
        electricCar.setOwnerName("Ivan");
        electricCar.setInsuranceNumber(67890);
        electricCar.setBatteryCapacity(80);

        System.out.println(car.toString());
        System.out.println(electricCar.toString());

        Vehicle vehicle1 = car;
        Vehicle vehicle2 = electricCar;

        System.out.println(vehicle1.vehicleType());
        System.out.println(vehicle2.vehicleType());
    }
}
