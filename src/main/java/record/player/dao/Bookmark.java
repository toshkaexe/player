package record.player.dao;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name="BOOKMARK")
public class Bookmark {
        @Id
        @Column(name="BOOKMARK_ID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name="AUDIBOOK_ID")
        private Long audiobookId;
        @Column(name="USER_ID")
        private Long userId;
        @Column(name="LASTPLAYED_TIME")
        private int lastPlayedTime; // Время последнего прослушивания

        public Bookmark(Long audiobookId, Long userId, int lastPlayedTime) {
                this.audiobookId = audiobookId;
                this.userId = userId;
                this.lastPlayedTime = lastPlayedTime;
        }
}
