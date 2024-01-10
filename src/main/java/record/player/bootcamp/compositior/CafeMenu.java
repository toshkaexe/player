package record.player.bootcamp.compositior;

//Ресторан предлагает различные блюда, а также комбо-наборы, которые включают в себя несколько блюд. Используйте паттерн "Компоновщик",
//чтобы создать структуру для представления меню ресторана, где каждое блюдо или комбо может быть частью общего списка.

import java.util.ArrayList;
import java.util.List;

//Ресторан предлагает различные блюда, а также комбо-наборы, которые включают в себя несколько блюд. Используйте паттерн "Компоновщик",
//чтобы создать структуру для представления меню ресторана, где каждое блюдо или комбо может быть частью общего списка.


public class CafeMenu {

    public static void main () {
        Dish pasta = new Dish("pasta");
        Dish salad = new Dish("salad");
        Dish stake = new Dish("stake");

        Combo lunchCombo = new Combo("Lunch combo");
        lunchCombo.add(pasta);
        lunchCombo.add(salad);

        Combo dinner = new Combo("Dinner");
        dinner.add(stake);
        dinner.add(salad);

        lunchCombo.display();
        dinner.display();

        dinner.add(dinner);
    }

    public interface IMenuItem {
        void display();
    }


    public static class Dish implements IMenuItem {

        private String name;

        public Dish(String name) {
            this.name = name;
        }

        @Override
        public void display() {
            System.out.printf("Dish: %s%n", name);
        }

    }

    public static class Combo implements IMenuItem {

        List<IMenuItem> dishes = new ArrayList<>();

        private String name;

        public Combo(String name) {
            this.name = name;
        }

        @Override
        public void display() {
            System.out.printf("Combo: %s%n", name);
            for(IMenuItem item: dishes) {
                item.display();
            }
        }

        public void add(IMenuItem item) {
            this.dishes.add(item);
        }

    }

}