package record.player.show;

import java.util.ArrayList;

public class MyClass {

    public static void main(String[] args) {

        AudioBookRepository audioBookRepository = new AudioBookRepository();
        AudioBookService audioBookService = new AudioBookService(audioBookRepository, new ArrayList<>());

        audioBookService.addAudioBook(1l, "Анна Каренина", "Толстой", 6000);
        audioBookService.addAudioBook(2l, "Три товарища", "Ремарк", 4800);
        audioBookService.addAudioBook(3l, "Мертвые души", "Гоголь", 4200);
        audioBookService.addAudioBook(4l, "Повелитель мух", "Голдинг", 3600);
        audioBookService.addAudioBook(5l, "Тень горы", "Шелеков", 5000);
        audioBookService.addAudioBook(6l, "Сто лет одиночества", "Маркес", 6600);
        audioBookService.addAudioBook(7l, "Фауст", "Гёте", 5800);
        audioBookService.addAudioBook(8l, "Дюна", "Герберт", 7200);
        audioBookService.addAudioBook(9l, "Процесс", "Кафка", 4000);
        audioBookService.addAudioBook(10l, "Шантарам", "Робертс", 8000);
        audioBookService.addAudioBook(12l, "Мартин Иден", "Лондон", 5400);
        audioBookService.addAudioBook(12l, "Лолита", "Набоков", 4800);
        audioBookService.addAudioBook(13l, "Звук и ярость", "Фолкнер", 6000);


        // Создаем двух пользователей
        User user1 = new User(1l, "Иванов");
        User user2 = new User(2l, "Петров");

        // Добавляем пользователей в сервис
        audioBookService.addUser(user1);
        audioBookService.addUser(user2);

        // Первый пользователь слушает две книги
        audioBookService.listenToAudioBook(user1.getId(), 1l, 10); // Слушает книгу 1 на 10 дней
        audioBookService.listenToAudioBook(user1.getId(), 3l, 15); // Слушает книгу 3 на 15 дней

        // Второй пользователь слушает три книги
        audioBookService.listenToAudioBook(user2.getId(), 3l, 20); // Слушает книгу 2 на 20 дней
        audioBookService.listenToAudioBook(user2.getId(), 4l, 12); // Слушает книгу 4 на 12 дней
        audioBookService.listenToAudioBook(user2.getId(), 6l, 18); // Слушает книгу 6 на 18 дней

        // Выводим информацию о слушаемых книгах и сроках слушания
        printUserListeningInfo(user1);
        printUserListeningInfo(user2);
    }

    private static void printUserListeningInfo(User user) {
        System.out.println("Listened Books for " + user.getUsername() + ":");
        user.getListenedBooks().forEach(audioBook -> {
            System.out.println(audioBook.getTitle() + " - Expiry Date: " + audioBook.getExpiryDate());
        });
        System.out.println();
    }


}
