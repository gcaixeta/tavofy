package io.github.gcaixeta.tavofy.resource.repository;

import io.github.gcaixeta.tavofy.resource.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
}
