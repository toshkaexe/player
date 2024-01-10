package record.player.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookRepository {
    private List<Book> books;

    public BookRepository() {
        this.books = new ArrayList<>();
    }
    // Create operation
    public void addBook(Book book) {
        books.add(book);
    }

    // Read operation
    public List<Book> getAllBooks() {
        return books;
    }

    public Optional<Book> getBookById(Long id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    // Update operation
    public void updateBook(Book updatedBook) {
        int index = books.indexOf(getBookById(updatedBook.getId()).orElse(null));
        if (index != -1) {
            books.set(index, updatedBook);
        }
    }

    // Delete operation
    public void deleteBook(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }
    // Additional methods
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<Book> findByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }
}
