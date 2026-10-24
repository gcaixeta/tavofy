package io.github.gcaixeta.tavofy.resource.service;

import io.github.gcaixeta.tavofy.resource.controller.dto.CreateAlbumRequest;
import io.github.gcaixeta.tavofy.resource.model.Album;
import io.github.gcaixeta.tavofy.resource.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albums;

    public Album createAlbum(CreateAlbumRequest album) {
        Album newAlbum = Album().bui
    }
}
