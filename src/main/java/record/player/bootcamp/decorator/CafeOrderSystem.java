package record.player.bootcamp.decorator;
    public class CafeOrderSystem  {
      public static void main(String[] args) {

          Drink teaWithSyrup = new SyropDecorator(new Tee());

          System.out.println(teaWithSyrup.getDescription());
          System.out.println(teaWithSyrup.getPrice());


          Drink espressoWithMilkAndSyrop = new MilkDecorator(new SyropDecorator(new Espresso()));

          System.out.println(espressoWithMilkAndSyrop.getDescription());
          System.out.println(espressoWithMilkAndSyrop.getPrice());
      }

    }

