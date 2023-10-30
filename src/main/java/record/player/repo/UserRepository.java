package record.player.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import record.player.dao.Bookmark;
import record.player.dao.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
