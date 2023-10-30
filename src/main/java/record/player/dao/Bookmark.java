package record.player.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Bookmark {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Long audiobookId;
        private Long userId;

        private int lastPlayedTime; // Время последнего прослушивания
}
