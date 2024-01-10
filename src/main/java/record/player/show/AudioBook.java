package record.player.show;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class AudioBook {

    private Long id;
    private String title;
    private String author;

    private int durationInSeconds;

    private List<User> listeners;
    private LocalDate expiryDate;

    public AudioBook(Long id, String title, String author, int durationInSeconds) {
        this.id = id;
        this.title = title;
        this.author = author;

        this.durationInSeconds = durationInSeconds;
        this.listeners = new ArrayList<>();
        this.expiryDate = null;  // No expiry date initially
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public List<User> getListeners() {
        return listeners;
    }

    public String getTitle() {
        return title;
    }

    public void setListeners(User user){
        this.listeners.add(user);
    }

    public void addListener(User user, LocalDate expiryDate) {
        listeners.add(user);
        setExpiryDate(expiryDate);
    }



    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void extendExpiry(int days) {
        expiryDate = expiryDate.plusDays(days);
    }

    public Long getId() {
        return id;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }


}
