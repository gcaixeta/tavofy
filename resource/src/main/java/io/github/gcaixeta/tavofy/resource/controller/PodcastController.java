package io.github.gcaixeta.tavofy.resource.controller;

import io.github.gcaixeta.tavofy.resource.model.Podcast;
import io.github.gcaixeta.tavofy.resource.repository.PodcastRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/podcasts")
@RequiredArgsConstructor
public class PodcastController {

    private final PodcastRepository podcastRepository;

    @GetMapping
    public List<Podcast> findAll() {
        return podcastRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Podcast> findById(@PathVariable Long id) {
        return podcastRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Podcast create(@RequestBody Podcast podcast) {
        podcast.setId(null);
        return podcastRepository.save(podcast);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Podcast> update(@PathVariable Long id, @RequestBody Podcast podcast) {
        if (!podcastRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        podcast.setId(id);
        return ResponseEntity.ok(podcastRepository.save(podcast));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!podcastRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        podcastRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
