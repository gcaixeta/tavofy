package io.github.gcaixeta.tavofy.resource.repository;

import io.github.gcaixeta.tavofy.resource.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
