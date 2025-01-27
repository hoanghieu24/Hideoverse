package com.javaweb.controller.web;

import java.util.List;
import java.util.Map;

import com.javaweb.model.dto.MusicReponse;
import com.javaweb.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping
    public ResponseEntity<List<MusicReponse>> searchMusic(
        @RequestParam Map<String, Object> params, 
        @RequestParam(required = false) String genre) {

        List<MusicReponse> musics = musicService.findAll(params, genre);
        return ResponseEntity.ok(musics);
    }
}
