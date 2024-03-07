import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle {

    String brand;
    String model;
    String fuelType;
    String transmission;
    double dailyPrice;
    static List<String> rentedVehicles =new ArrayList<>();
    static List<Integer> priceVehicles =new ArrayList<>();

    public  void vehicle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the brand of the car");
        this.brand =scan.next();
        System.out.println("Please enter the model of the car");
        this.model=scan.next();
        System.out.println("Please enter the fuel type");
        this.fuelType =scan.next();
        System.out.println("Please enter the transmission type");
        this.transmission =scan.next();
        rentedVehicles.add(brand);
        priceVehicles.add(300);

    }

    public Vehicle(String brand, String model, String fuelType, String transmission) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Your vehicle's : " +
                "\nbrand : " + brand +
                "\nmodel : " + model +
                "\nfuel type : " + fuelType +
                "\ntransmission type : " + transmission;

    }

    public Vehicle() {
    }
    public static void createAVehicle(){
        String brand;
        String model;
        String fuelType;
        String transmission;
    }
}
