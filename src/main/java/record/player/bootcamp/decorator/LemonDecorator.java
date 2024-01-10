package record.player.bootcamp.decorator;

public class LemonDecorator implements Drink {
    private Drink drink;

    public LemonDecorator(Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {
        return drink.getDescription() + " with lemon";
    }

    public double getPrice() {
        return drink.getPrice() + 0.89;
    }
}
