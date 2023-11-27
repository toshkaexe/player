package record.player.bootcamp.thread;

import java.util.ArrayList;
import java.util.List;

public class LearnThread {
   public  int  value;

   public void increment(){
        ++value;
        System.out.println(Thread.currentThread().getName() + " = "+value);
    }

    public int getValue(){
        return value;
    }

    public static void main(String[] args) throws InterruptedException {
         final LearnThread learnThread = new LearnThread();

        Runnable task = ()->{
            for (int i=0; i<100;i++){
                learnThread.increment();
            }
        };

      /* for (int i=0;i<100;i++) {
            new Thread(task).start();

        }
       System.out.println("---------");
        System.out.println("Counter result: " + learnThread.getValue());
      */

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(task);
            thread.start();

            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("---------");
        System.out.println("Counter result: " + learnThread.getValue());
    }

}
