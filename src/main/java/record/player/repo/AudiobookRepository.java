package record.player.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import record.player.dao.AudioBook;
public interface AudiobookRepository extends JpaRepository<AudioBook, Long> {
    // Методы для работы с аудиокнигами
}