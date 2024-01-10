package record.player.demo;

import java.util.List;
import java.util.Optional;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Create operation
    public void addBook(Long id, String title, String author, String description) {
        Book newBook = new Book(id, title, author, description);
        bookRepository.addBook(newBook);
    }

    // Read operation
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.getBookById(id);
    }
    public void updateBook(Long id, String title, String author, String description) {
        Optional<Book> optionalBook = bookRepository.getBookById(id);

        if (optionalBook.isPresent()) {
            Book updatedBook = new Book(id, title, author, description);
            bookRepository.updateBook(updatedBook);
        }
    }

    public void deleteBook(Long id) {
        bookRepository.deleteBook(id);
    }

    public List<Book> findByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
