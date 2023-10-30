package record.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import record.player.dao.AudioBook;
import record.player.dao.Bookmark;
import record.player.dao.User;
import record.player.repo.AudiobookRepository;
import record.player.repo.UserRepository;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    public User getUserbyId(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        // Можно реализовать обработку отсутствия аудиокнига с заданным id.
        return user.orElse(null);
    }
}
