package record.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import record.player.dao.Bookmark;
import record.player.dao.User;
import record.player.service.BookmarkService;
import record.player.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User getUserBookmarks(@PathVariable Long userId) {
        return userService.getUserbyId(userId);
    }
   @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}

