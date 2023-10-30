package record.player.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import record.player.repo.AudiobookRepository;
import record.player.dao.AudioBook;
import java.util.List;
import java.util.Optional;
import record.player.dao.AudioBook;
@Service
public class AudiobookService {
   // @Autowired
    private AudiobookRepository audiobookRepository;


    public List<AudioBook> getAllAudiobooks() {

        return audiobookRepository.findAll();
    }

    public AudioBook getAudiobookById(Long id) {
        Optional<AudioBook> audiobook = audiobookRepository.findById(id);
        // Можно реализовать обработку отсутствия аудиокнига с заданным id.
        return audiobook.orElse(null);

    }

    public AudioBook addAudiobook(AudioBook audiobook) {
        return audiobookRepository.save(audiobook);
    }

    public AudioBook updateAudiobook(Long id, AudioBook updatedAudiobook) {
        Optional<AudioBook> existingAudiobook = audiobookRepository.findById(id);
        if (existingAudiobook.isPresent()) {
            updatedAudiobook.setId(id);
            return audiobookRepository.save(updatedAudiobook);
        }
        return null; // Можно реализовать обработку, если аудиокниг с заданным id не найден.
    }

    public void deleteAudiobook(Long id) {
        audiobookRepository.deleteById(id);
    }
}
