package record.player.show;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String username;
    private List<AudioBook> listenedBooks;

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
        this.listenedBooks = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public List<AudioBook> getListenedBooks() {
        return listenedBooks;
    }

    public void listenToAudioBook(AudioBook audioBook, int days) {
        LocalDate expiryDate = LocalDate.now().plusDays(days);
        audioBook.addListener(this, expiryDate);
        //   System.out.println(expiryDate);
        this.listenedBooks.add(audioBook);
    }

//    public void addBookmark(AudioBook audioBook, int position) {
//        if (listenedBooks.contains(audioBook)) {
//            audioBook.addBookmark(this, position);
//        } else {
//            System.out.println("Cannot add bookmark. User is not currently listening to this audiobook.");
//        }
//    }

}

