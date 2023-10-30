package record.player.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import record.player.dao.Bookmark;

import java.util.List;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    List<Bookmark> findByUserId(Long userId);

}