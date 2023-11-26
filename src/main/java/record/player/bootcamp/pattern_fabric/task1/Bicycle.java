package record.player.bootcamp.pattern_fabric.task1;

public class Bicycle extends Vehicle{
    public Bicycle(int numberOfSeats) {
        // Велосипеды могут иметь только одно сиденье
        super(1);
    }

    @Override
    void start() {
        System.out.println("Bicycle started");
    }

    @Override
    void stop() {
        System.out.println("Bicycle stopped");
    }

}
