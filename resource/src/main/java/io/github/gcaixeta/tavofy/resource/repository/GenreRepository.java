package io.github.gcaixeta.tavofy.resource.repository;

import io.github.gcaixeta.tavofy.resource.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
