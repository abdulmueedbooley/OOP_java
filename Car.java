public class Car{
    String model;
    String make;
    Boolean is_running;

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

    Car(String model, String make) {
        this.model = model;
        this.make = make;
        this.is_running = true;
    }
}