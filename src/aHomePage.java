import java.util.Scanner;

public class aHomePage {
    static int choice;
   static boolean continueOrNot = false;
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("         AUTOMOBILE SHOWROOM             ");
        System.out.println("-----------------------------------------");
        System.out.println("************  You're Welcome  ***********");
        System.out.println("How Can I Help You?");

        do {
            System.out.println("... Enter the number associated with the car brand to rent and  to learn more about");
            System.out.println("1-->OPEL");
            System.out.println("2-->TOYATA");
            System.out.println("3-->VOLVO");
            System.out.println("4--> CREATE YOURSELF");
            choice = scan.nextInt();
            if (choice < 0 || choice > 4) {
                System.out.println("Enter the number associated with the car brand you wish to learn more about");
            } else {

                switch (choice) {
                    case 1:

                        Vehicle vechicle1 = new Vehicle("Opel", "Astra", "LPG", "Manual");
                        System.out.println(vechicle1);
                        Vehicle.rentedVehicles.add(vechicle1.brand);
                        Vehicle.priceVehicles.add(100);
                        anaSayfaDongusu();
                        break;
                    case 2:
                        Vehicle vehicle2 = new Vehicle("Toyata", "Coralla", "Dizel", "Manual");
                        System.out.println(vehicle2);
                        Vehicle.rentedVehicles.add(vehicle2.brand);
                        Vehicle.priceVehicles.add(120);
                        anaSayfaDongusu();
                        break;
                    case 3:
                        Vehicle vehicle3 = new Vehicle("Volvo", "S90", "Petrol", "Automatic ");
                        System.out.println(vehicle3);
                        Vehicle.rentedVehicles.add(vehicle3.brand);
                        Vehicle.priceVehicles.add(150);
                        anaSayfaDongusu();
                        break;
                    case 4:
                        Vehicle vehicle4 = new Vehicle();
                        System.out.println("Please enter the brand of the car");
                        vehicle4.brand = scan.next();
                        System.out.println("Please enter the model of the car");
                        vehicle4.model = scan.next();
                        System.out.println("Please enter the fuel type");
                        vehicle4.fuelType = scan.next();
                        System.out.println("Please enter the transmission type");
                        vehicle4.transmission = scan.next();
                        System.out.println(vehicle4);
                        Vehicle.priceVehicles.add(300);
                        anaSayfaDongusu();
                }


            }
        } while (!continueOrNot);

        Payment.payment();


    }

    public static void anaSayfaDongusu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("To rent another vehicle, press E\nFor payment, type any key....");
        String loopV=scan.next();
        if (loopV.equalsIgnoreCase("E")){
            continueOrNot =false;
        }else {
            continueOrNot =true;
        }
    }
}
