package record.player.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import record.player.dao.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

}