package record.player.bootcamp.thread;

public class Learn extends Thread{

    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Thread t1 = new Thread(new Learn());
        Thread t2 = new Thread(new Learn());
        Thread t3 = new Thread(new Learn());
        t1.run();
        t2.run();
        t3.run();


    }

}
