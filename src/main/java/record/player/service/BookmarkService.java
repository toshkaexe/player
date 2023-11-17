package record.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import record.player.dao.Bookmark;
import record.player.dao.User;
import record.player.repo.BookmarkRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookmarkService implements record.player.service.Service {

    // Assuming you have a repository to interact with bookmarks
    @Autowired
    private BookmarkRepository bookmarkRepository;


    public List<Bookmark> getUserBookmarks(Long userId) {
        return bookmarkRepository.findByUserId(userId);
    }

    public Bookmark addBookmark(Bookmark bookmark) {
        // Additional logic can be added here, like checking duplicate bookmarks or validation
        return bookmarkRepository.save(bookmark);
    }

    public Bookmark updateBookmark(Long id, Bookmark updatedBookmark) {
        Optional<Bookmark> existingBookmark = bookmarkRepository.findById(id);
        if (existingBookmark.isPresent()) {
            //   updatedBookmark.setId(id);
            return bookmarkRepository.save(updatedBookmark);
        }
        return null; // Handle if the bookmark with the given id is not found
    }


    public List<Bookmark> getAllBookmarks() {
        return bookmarkRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        bookmarkRepository.deleteById(id);
    }
}
