package record.player.bootcamp.pattern_fabric.task1;

public class Car extends Vehicle{

    public Car(int numberOfSeats) {
        super(numberOfSeats);
    }
    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("Car stopped");
    }
}
