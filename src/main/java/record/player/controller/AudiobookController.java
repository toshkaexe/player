package record.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import record.player.service.AudiobookService;
import record.player.dao.AudioBook;

import java.util.List;

@RestController
@RequestMapping("/api/audiobooks")
public class AudiobookController implements IAudioBook{

    @Autowired
    private AudiobookService audiobookService; // Предположим, что у вас есть сервис, реализующий логику для работы с аудиокнигами.

    @Override
    @GetMapping
    public List<AudioBook> getAll() {

        return audiobookService.getAllAudiobooks();
    }
    @Override
    @GetMapping("/{id}")
    public AudioBook getById(@PathVariable Long id) {

        return audiobookService.getAudiobookById(id);
    }
    @Override
    @PostMapping
    public AudioBook add(@RequestBody AudioBook audiobook) {

        return audiobookService.addAudiobook(audiobook);
    }

    @Override
    @PutMapping("/{id}")
    public AudioBook update(@PathVariable Long id, @RequestBody AudioBook audiobook) {
        return audiobookService.updateAudiobook(id, audiobook);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        audiobookService.delete(id);
    }




}
