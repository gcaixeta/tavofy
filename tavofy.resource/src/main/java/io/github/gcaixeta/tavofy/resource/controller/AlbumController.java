package io.github.gcaixeta.tavofy.resource.controller;

import io.github.gcaixeta.tavofy.resource.controller.dto.CreateAlbumRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/albums")
@RequiredArgsConstructor
public class AlbumController {

    private final AlbumService service;

    @PostMapping
    public ResponseEntity<CreateAlbumResponse> create(@RequestBody CreateAlbumRequest request) {


    }
}
