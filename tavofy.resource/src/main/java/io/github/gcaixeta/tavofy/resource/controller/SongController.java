package io.github.gcaixeta.tavofy.resource.controller;

import io.github.gcaixeta.tavofy.resource.model.Song;
import io.github.gcaixeta.tavofy.resource.repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
@RequiredArgsConstructor
public class SongController {

    private final SongRepository songRepository;

    @GetMapping
    public ResponseEntity<List<Song>> findAll() {
        var allSongs = songRepository.findAll();
        return ResponseEntity.ok(allSongs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Song> findById(@PathVariable Long id) {
        return songRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Song> create(@RequestBody Song song) {
        song.setId(null);
        var savedSong = songRepository.save(song);
        return ResponseEntity.ok(savedSong);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Song> update(@PathVariable Long id, @RequestBody Song song) {
        if (!songRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        song.setId(id);
        return ResponseEntity.ok(songRepository.save(song));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!songRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        songRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
