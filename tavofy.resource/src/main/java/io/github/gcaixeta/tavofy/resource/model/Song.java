package io.github.gcaixeta.tavofy.resource.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "songs")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Song {
    //TODO: Add constraints to the columns

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer duration;
    private LocalDate releaseDate;
    private String genre;

    public Song() {}
}
