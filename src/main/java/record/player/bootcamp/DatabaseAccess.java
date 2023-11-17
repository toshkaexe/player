package record.player.bootcamp;

import java.util.concurrent.Semaphore;
/*
Света, привет! Я тут пересматириваю запись нашего понедельничного урока.
Ты сказала, что если работать с базой данных, то там отдельный паттерны
и отдельная логика. Вопрос, у нас будет это на лекция в курсе? Если нет,
 то буду очень рад, если подскажешь может быть ресурсы, где можно новичку про это прочитать
 */

public class DatabaseAccess {
    private Semaphore semaphore;
    private static DatabaseAccess instance;

    private DatabaseAccess(int maxConnections) {
         // Определяем семафор с максимальным количеством соединений
        semaphore = new Semaphore(maxConnections, true);
    }

    public static DatabaseAccess getInstance(int maxConnections) {
        if (instance == null) {
            instance = new DatabaseAccess(maxConnections);
        }
        return instance;
    }
    public void queryDatabase() {
        try {
            // Запрашиваем разрешение на доступ
            semaphore.acquire();
            System.out.println("Поток " + Thread.currentThread().getName() + " получил доступ к базе данных");
            // Здесь выполняется код обращения к базе данных
            Thread.sleep(2000); // Имитация обращения к базе данных
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Поток " + Thread.currentThread().getName() + " завершил доступ к базе данных");
            // Освобождаем разрешение
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        final int MAX_CONNECTIONS = 3;
        DatabaseAccess database = DatabaseAccess.getInstance(MAX_CONNECTIONS);

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                database.queryDatabase();
            });
            thread.start();
        }
    }
}

