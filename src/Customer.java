import java.util.Scanner;

public class Customer {

    static String name;
    static String surname;
    static String age;
    static String pickUpCity;


    public static void customerInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = scan.nextLine();
        System.out.println("Please enter your family name");
        surname = scan.next();
        System.out.println("Please enter your age");
        age = scan.nextLine();
        System.out.println("Please select the pick-up city");
        pickUpCity = scan.nextLine();
    }

    public static void cardInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type in your credit card number");
        String id = scan.next();
        if (id.length() != 16) {
            cardInfo();
        }

    }


}
