package record.player.show;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AudioBookRepository {
    private List<AudioBook> audioBooks;

    public AudioBookRepository() {
        this.audioBooks = new ArrayList<>();
    }

    public void addAudioBook(AudioBook audioBook) {
        audioBooks.add(audioBook);
    }

    public List<AudioBook> getAllAudioBooks() {
        return new ArrayList<>(audioBooks);
    }

    public Optional<AudioBook> getAudioBookById(Long id) {
        return audioBooks.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    public void updateAudioBook(AudioBook updatedAudioBook) {
        int index = audioBooks.indexOf(getAudioBookById(updatedAudioBook.getId()).orElse(null));
        if (index != -1) {
            audioBooks.set(index, updatedAudioBook);
        }
    }

    public void deleteAudioBook(Long id) {
        audioBooks.removeIf(book -> book.getId().equals(id));
    }
}
