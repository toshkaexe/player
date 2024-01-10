package record.player.bootcamp.decorator;

public class MilkDecorator implements Drink {
    private Drink drink;

    public MilkDecorator(Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {
        return drink.getDescription() + " with milk";
    }

    public double getPrice() {
        return drink.getPrice() + 0.89;
    }
}
