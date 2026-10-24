package io.github.gcaixeta.tavofy.resource.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "artists")
@Data
@Builder
@AllArgsConstructor
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean isColective;
    private String nationality;
    private boolean isActive;

    public Artist(){}
}
