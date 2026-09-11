public class Car{
    String model = "Ford";
    String make = "Mustang";
    Boolean is_running = false;

    void start(){
        is_running = true;
        System.out.println(is_running);
        System.out.println("The car is starting");
    }

    void stop(){
        is_running = false;
        System.out.println(is_running);
        System.out.println("The car is stopping");
    }
}