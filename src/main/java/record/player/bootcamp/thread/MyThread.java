package record.player.bootcamp.thread;

public class MyThread {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Поток для увеличения счетчика
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Поток для чтения значения счетчика
        Thread readThread = new Thread(() -> {
            // Пауза для убеждения, что поток увеличения успел начать выполнение
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Значение счетчика: " + counter.getCount());
        });

        incrementThread.start();
        readThread.start();

        // Ждем, пока оба потока завершат выполнение
        try {
            incrementThread.join();
            readThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Counter {
    //
   // Ключевое слово volatile используется для обеспечения видимости переменных между потоками.
    // Это гарантирует, что изменения переменной видны сразу всем потокам.
    private volatile int count = 0;

    public void increment() {
        count++;
        System.out.println(count);
    }

    public int getCount() {
        return count;
    }
}