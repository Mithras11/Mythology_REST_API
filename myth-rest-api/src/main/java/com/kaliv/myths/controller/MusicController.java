package com.kaliv.myths.controller;

import javax.validation.Valid;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kaliv.myths.constant.messages.ResponseMessages;
import com.kaliv.myths.dto.musicDtos.CreateMusicDto;
import com.kaliv.myths.dto.musicDtos.MusicDto;
import com.kaliv.myths.dto.musicDtos.MusicResponseDto;
import com.kaliv.myths.dto.musicDtos.UpdateMusicDto;
import com.kaliv.myths.service.music.MusicService;

@RestController
@RequestMapping("/api/v1/music")
public class MusicController {

    private final MusicService musicService;

    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping
    public ResponseEntity<List<MusicResponseDto>> getAllMusic() {
        return ResponseEntity.ok(musicService.getAllMusic());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicResponseDto> getMusicById(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(musicService.getMusicById(id));
    }

    @PostMapping
    public ResponseEntity<MusicDto> createMusic(@Valid @RequestBody CreateMusicDto dto) {
        return new ResponseEntity<>(musicService.createMusic(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public MusicDto updateMusic(@PathVariable("id") long id, @Valid @RequestBody UpdateMusicDto dto) {
        return musicService.updateMusic(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMusic(@PathVariable(name = "id") long id) {
        musicService.deleteMusic(id);
        return new ResponseEntity<>(ResponseMessages.MUSIC_DELETED, HttpStatus.OK);
    }
}