import java.util.Scanner;

public class Payment {


    public static void payment() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please fill in your details...");
        Customer.customerInfo();
        Customer.cardInfo();
        System.out.println("Please enter the number of days for your rental");
        int dayOfUse = scan.nextInt();
        int totalPrice = 0;

        for (int i = 0; i < Vehicle.priceVehicles.size(); i++) {

            totalPrice += Vehicle.priceVehicles.get(i);
        }
        totalPrice *= dayOfUse;
        System.out.println("Your total payment amount is : " + totalPrice + "$");
        System.out.println("Congratulations, your payment is complete! :)");
        System.out.println("Vehicles you have rented : " + Vehicle.rentedVehicles);
        System.out.println("::::: Have a great day! :::::");

    }

}
