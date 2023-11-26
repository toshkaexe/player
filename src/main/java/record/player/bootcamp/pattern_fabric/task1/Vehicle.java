package record.player.bootcamp.pattern_fabric.task1;
/*
1) Предположим, у вас есть приложение для создания и
управления различными видами транспортных средств: автомобили, велосипеды и самолеты.
Вам необходимо реализовать систему, чтобы создавать объекты каждого типа транспорта.
*/
public abstract class Vehicle {
    private int numberOfSeats;

    public Vehicle(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    abstract void start();
    abstract void stop();

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

}
