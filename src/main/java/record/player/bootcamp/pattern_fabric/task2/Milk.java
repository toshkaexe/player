package record.player.bootcamp.pattern_fabric.task2;


interface Drink{
    void drink();
}


public class Milk implements Drink{

    @Override
    public void drink() {
        System.out.println("Drink tee");

    }
}
interface Factory{
    Drink createdrink();
}

class ConcreteFabric implements Factory {

    @Override
    public Drink createdrink() {
        return new Milk();
    }
}
