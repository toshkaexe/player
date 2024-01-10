package record.player.show;
import java.util.List;
import java.util.Optional;

public class AudioBookService {

    private AudioBookRepository audioBookRepository;
    private List<User> users;

    public AudioBookService(AudioBookRepository audioBookRepository, List<User> users) {
        this.audioBookRepository = audioBookRepository;
        this.users = users;
    }

    public void addAudioBook(Long id, String title, String author, int durationInSeconds) {
        AudioBook audioBook = new AudioBook(id, title, author, durationInSeconds);
        audioBookRepository.addAudioBook(audioBook);
    }

    public List<AudioBook> getAllAudioBooks() {
        return audioBookRepository.getAllAudioBooks();
    }

    public Optional<AudioBook> getAudioBookById(Long id) {
        return audioBookRepository.getAudioBookById(id);
    }

    public void updateAudioBook(Long id, String title, String author, int durationInSeconds) {
        Optional<AudioBook> optionalAudioBook = audioBookRepository.getAudioBookById(id);
        if (optionalAudioBook.isPresent()) {
            AudioBook updatedAudioBook = optionalAudioBook.get();
            updatedAudioBook.setTitle(title);
            updatedAudioBook.setAuthor(author);
            updatedAudioBook.setDurationInSeconds(durationInSeconds);
            audioBookRepository.updateAudioBook(updatedAudioBook);
        }
    }

    public void deleteAudioBook(Long id) {
        audioBookRepository.deleteAudioBook(id);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(Long userId) {
        users.removeIf(user -> user.getId().equals(userId));
    }

    public void listenToAudioBook(Long userId, Long audioBookId, int days) {
        Optional<User> optionalUser = users.stream().filter(user -> user.getId().equals(userId)).findFirst();
        Optional<AudioBook> optionalAudioBook = audioBookRepository.getAudioBookById(audioBookId);

        if (optionalUser.isPresent() && optionalAudioBook.isPresent()) {
            User user = optionalUser.get();
            AudioBook audioBook = optionalAudioBook.get();


                user.listenToAudioBook(audioBook, days);
                audioBook.setListeners(user);

        }
    }

    public void extendAudioBookExpiry(Long userId, Long audioBookId, int days) {
        Optional<User> optionalUser = users.stream().filter(user -> user.getId().equals(userId)).findFirst();
        Optional<AudioBook> optionalAudioBook = audioBookRepository.getAudioBookById(audioBookId);

        if (optionalUser.isPresent() && optionalAudioBook.isPresent()) {
            User user = optionalUser.get();
            AudioBook audioBook = optionalAudioBook.get();

            // Check if the user has this audio book in their listened books
            if (user.getListenedBooks().contains(audioBook)) {
                audioBook.extendExpiry(days);
            }
        }
    }
}
