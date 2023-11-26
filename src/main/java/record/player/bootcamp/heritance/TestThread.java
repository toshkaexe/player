package record.player.bootcamp.heritance;

public class TestThread extends Thread{
    public void start(){
        System.out.println("start method");
    }
    public void run(){
        System.out.println("run method");
    }

    public static void main(String[] args) {
        Thread t1 = new TestThread();
        Thread t2 = new TestThread();

        t1.start();
        t2.start();
    }
}
