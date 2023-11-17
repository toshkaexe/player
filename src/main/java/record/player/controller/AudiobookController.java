package record.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import record.player.service.AudiobookService;
import record.player.dao.AudioBook;

import java.util.List;

@RestController
@RequestMapping("/api/audiobooks")
public class AudiobookController {

    @Autowired
    private AudiobookService audiobookService; // Предположим, что у вас есть сервис, реализующий логику для работы с аудиокнигами.

    @GetMapping
    public List<AudioBook> getAllAudiobooks() {

        return audiobookService.getAllAudiobooks();
    }

    @GetMapping("/{id}")
    public AudioBook getAudiobookById(@PathVariable Long id) {

        return audiobookService.getAudiobookById(id);
    }

    @PostMapping
    public AudioBook addAudiobook(@RequestBody AudioBook audiobook) {

        return audiobookService.addAudiobook(audiobook);
    }

    @PutMapping("/{id}")
    public AudioBook updateAudiobook(@PathVariable Long id, @RequestBody AudioBook audiobook) {
        return audiobookService.updateAudiobook(id, audiobook);
    }

    @DeleteMapping("/{id}")
    public void deleteAudiobook(@PathVariable Long id) {
        audiobookService.delete(id);
    }
}
