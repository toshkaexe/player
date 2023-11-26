package record.player.bootcamp.pattern_fabric.task1;

public class CarFactory extends TransportFactory{
    @Override
    Vehicle createVehicle(int numberOfSeats) {
        return new Car(numberOfSeats);
    }
}
