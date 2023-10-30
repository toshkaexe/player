package record.player.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import record.player.dao.AudioBook;
import record.player.dao.Bookmark;
import record.player.service.AudiobookService;
import record.player.service.BookmarkService;
import javax.annotation.PostConstruct;

@Configuration
public class FakeDataInitializer {
    /*
    private final AudiobookService audiobookService; // Инициализация сервиса аудиокниг
    private final BookmarkService bookmarkService; // Инициализация сервиса закладок

    @Autowired
    public FakeDataInitializer(AudiobookService audiobookService,
                               BookmarkService bookmarkService) {
        this.audiobookService = audiobookService;
        this.bookmarkService = bookmarkService;
    }
    @PostConstruct
    public void initializeData() {
        // Добавление фейковых аудиокниг
        AudioBook audiobook1 = new AudioBook("Title 1", "Author 1", "URL 1");
        AudioBook audiobook2 = new AudioBook("Title 2", "Author 2", "URL 2");

        audiobookService.addAudiobook(audiobook1);
        audiobookService.addAudiobook(audiobook2);
        Long userId = 1L; // Пример userId
        // Добавление фейковых закладок
        Bookmark bookmark1 = new Bookmark(audiobook1.getId(), userId, 300); // Пример закладки с временной отметкой в 300 секунд
        Bookmark bookmark2 = new Bookmark(audiobook2.getId(), userId, 150);

        bookmarkService.addBookmark(bookmark1);
        bookmarkService.addBookmark(bookmark2);
    }

     */
}
