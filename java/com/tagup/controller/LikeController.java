package com.tagup.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tagup.model.Like;
import com.tagup.service.LikeService;

@RestController
@RequestMapping("/likes")
@CrossOrigin("*")
public class LikeController {
	 
	@Autowired
    private LikeService likeService;

    @PostMapping("/create")
    public ResponseEntity<Like> createLike(@RequestBody Like like) {
        Like createdLike = likeService.saveLike(like);
        return ResponseEntity.ok(createdLike);
    }

    @GetMapping("/getLikeById/{id}")
    public ResponseEntity<Optional<Like>> getLikeById(@PathVariable Long id) {
        Optional<Like> like = likeService.findLikeById(id);
        return ResponseEntity.ok(like);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Like>> getAllLikes() {
        List<Like> likes = likeService.findAllLikes();
        return ResponseEntity.ok(likes);
    }

    @DeleteMapping("/deleteLikeById/{id}")
    public ResponseEntity<Void> deleteLikeById(@PathVariable Long id) {
        likeService.deleteLikeById(id);
        return ResponseEntity.noContent().build();
    }
}