package record.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import record.player.dao.Bookmark;
import record.player.service.BookmarkService;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkController  implements IBookmark{

    @Autowired
    private BookmarkService bookmarkService; // Assuming you have a service that handles bookmark operations

    @Override
    @GetMapping("/{userId}")
    public Bookmark getById(@PathVariable Long userId) {
        return (Bookmark) bookmarkService.getUserBookmarks(userId);
    }
    @Override
    @PostMapping
    public void add(@RequestBody Bookmark bookmark) {
         bookmarkService.addBookmark(bookmark);
    }
    @Override
    @PutMapping("/{id}")
    public Bookmark update(@PathVariable Long id, @RequestBody Bookmark bookmark) {
        return bookmarkService.updateBookmark(id, bookmark);
    }
    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookmarkService.delete(id);
    }
    //@Override
    @GetMapping("/")
    public List<Bookmark> getAll() {
        
        return bookmarkService.getAllBookmarks();
    }


}
