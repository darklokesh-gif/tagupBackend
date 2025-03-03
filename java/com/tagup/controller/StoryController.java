package com.tagup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tagup.model.Story;
import com.tagup.service.StoryService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stories")
@CrossOrigin("*")
public class StoryController {
	@Autowired
    private  StoryService storyService;

    @PostMapping("/create")
    public ResponseEntity<Story> createStory(@RequestBody Story story) {
        return ResponseEntity.ok(storyService.saveStory(story));
    }

    @GetMapping("/getStoryById/{id}")
    public ResponseEntity<Optional<Story>> getStoryById(@PathVariable Long id) {
        return ResponseEntity.ok(storyService.findStoryById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Story>> getAllStories() {
        return ResponseEntity.ok(storyService.findAllStories());
    }

    @DeleteMapping("/deleteStoryById/{id}")
    public ResponseEntity<Void> deleteStoryById(@PathVariable Long id) {
        storyService.deleteStory(id);
        return ResponseEntity.noContent().build();
    }
}