package record.player.bootcamp.thread;

public class LearnThread {
   public volatile  int  value = 0;

   public void increment(){
        ++value;
        System.out.println( Thread.currentThread().getName() + " :"  + value);
    }

    public int getValue(){
        return value;
    }

    public static void main(String[] args) {
         final LearnThread learnThread = new LearnThread();

        Runnable task = ()->{
            for (int i=0; i<100;i++){
                learnThread.increment();
            }
        };

       for (int i=0;i<100;i++) {
            new Thread(task).start();
        }
       System.out.println("---------");
        System.out.println("Counter result: " + learnThread.getValue());
    }
}
