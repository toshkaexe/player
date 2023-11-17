package record.player.bootcamp;

public class Tilgungsplan {
  
    private int value=0;

    public void count() {
        ++value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        final Tilgungsplan counter = new Tilgungsplan();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    counter.count();
                }
            }
        };

        for (int i = 0; i < 100; i++) {
            new Thread(task).run();
       //     System.out.println(i);            
         //   System.out.println("Loop=: " + counter.getValue());
        }

        System.out.println("Counter result: " + counter.getValue());
    }
}