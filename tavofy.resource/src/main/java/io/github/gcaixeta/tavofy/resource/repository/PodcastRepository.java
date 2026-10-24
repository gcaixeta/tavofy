package io.github.gcaixeta.tavofy.resource.repository;

import io.github.gcaixeta.tavofy.resource.model.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast, Long> {
}
