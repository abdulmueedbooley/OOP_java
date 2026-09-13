import java.util.*;
public class Main{
    public static void main(String[] args){
        
    // Scanner new = new Scanner(System.in);
    Scanner temp = new Scanner(System.in);
    System.out.println("Please enter car model:");
    String car_model = temp.nextLine();

    System.out.println("Enter car make: ");
    String car_make = temp.nextLine();

    Car car_info = new Car(car_model, car_make);

    System.out.println("Car model is: " + car_info.model);
    System.out.println("Car make is: " + car_info.make);


    temp.close();
    }
}