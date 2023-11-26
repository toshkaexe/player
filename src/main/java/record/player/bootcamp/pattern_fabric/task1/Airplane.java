package record.player.bootcamp.pattern_fabric.task1;

public class Airplane extends Vehicle{
    public Airplane(int numberOfSeats) {
        super(numberOfSeats);
    }

    @Override
    void start() {
        System.out.println("Airplane started");
    }

    @Override
    void stop() {
        System.out.println("Airplane stopped");
    }
}
