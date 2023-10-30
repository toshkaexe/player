package record.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import record.player.dao.Bookmark;
import record.player.dao.User;
import record.player.service.BookmarkService;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkController {

    @Autowired
    private BookmarkService bookmarkService; // Assuming you have a service that handles bookmark operations

    @GetMapping("/{userId}")
    public List<Bookmark> getUserBookmarks(@PathVariable Long userId) {
        return bookmarkService.getUserBookmarks(userId);
    }
    @PostMapping
    public Bookmark addBookmark(@RequestBody Bookmark bookmark) {
        return bookmarkService.addBookmark(bookmark);
    }

    @PutMapping("/{id}")
    public Bookmark updateBookmark(@PathVariable Long id, @RequestBody Bookmark bookmark) {
        return bookmarkService.updateBookmark(id, bookmark);
    }

    @DeleteMapping("/{id}")
    public void deleteBookmark(@PathVariable Long id) {
        bookmarkService.deleteBookmark(id);
    }

    @GetMapping("/")
    public List<Bookmark> getBookmarks() {
        return bookmarkService.getAllBookmarks();
    }
}
