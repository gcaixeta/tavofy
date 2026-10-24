package io.github.gcaixeta.tavofy.resource.controller.dto;

import io.github.gcaixeta.tavofy.resource.model.Song;

import java.time.LocalDate;
import java.util.List;

public record CreateAlbumRequest(
        String title,
        LocalDate releaseDate,
        List<Song> songList
) {
}
