package io.github.gcaixeta.tavofy.resource.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "genres", uniqueConstraints = @UniqueConstraint(name = "uk_genre_slug_type", columnNames = {"slug", "type"}))
@Data
@Builder
@AllArgsConstructor
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String slug;

    @Enumerated(EnumType.STRING)
    private GenreType type;

    public Genre(){}
}
