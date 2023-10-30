package record.player.dao;


import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="AUDIOBOOK")
public class AudioBook {
    @Id
    @Column(name = "AUDIOBOOK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "AUDIOBOOK_TITLE")
    private String title;
    @Column(name = "AUDIOBOOK_AUTHOR")
    private String author;
    @Column(name = "AUDIO_URL")
    private String audioUrl;

    public AudioBook(String title, String author, String audioUrl) {
        this.title = title;
        this.author = author;
        this.audioUrl = audioUrl;
    }
}
