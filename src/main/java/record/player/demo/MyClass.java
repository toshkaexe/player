package record.player.demo;

import java.util.List;
import java.util.Optional;

public class MyClass {

    public static void main(String[] args) {
        // Создаем репозиторий и сервис
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);

        // Добавляем несколько книг
        bookService.addBook(1L, "The Great Gatsby", "F. Scott Fitzgerald", "A classic novel about the American Dream");
        bookService.addBook(2L, "To Kill a Mockingbird", "Harper Lee", "A novel set in the American South during the 1930s");

        // Получаем все книги и выводим их
        List<Book> allBooks = bookService.getAllBooks();
        System.out.println("All Books:");
        allBooks.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));

        // Получаем книгу по ID и выводим ее
        Optional<Book> bookById = bookService.getBookById(1L);
        bookById.ifPresent(book -> System.out.println("Book by ID: " + book.getTitle() + " by " + book.getAuthor()));

        // Обновляем книгу
        bookService.updateBook(1L, "The Great Gatsby (Updated)", "F. Scott Fitzgerald", "An updated version of the classic");

        // Получаем обновленную книгу и выводим ее
        bookById = bookService.getBookById(1L);
        bookById.ifPresent(book -> System.out.println("Updated Book by ID: " + book.getTitle() + " by " + book.getAuthor()));

        // Удаляем книгу по ID
        bookService.deleteBook(2L);

        // Получаем оставшиеся книги и выводим их
        allBooks = bookService.getAllBooks();
        System.out.println("Remaining Books:");
        allBooks.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));
    }

}

