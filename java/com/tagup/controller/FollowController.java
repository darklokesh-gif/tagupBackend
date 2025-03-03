package com.tagup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tagup.model.Follow;
import com.tagup.model.User;
import com.tagup.service.FollowService;

import java.util.List;

@RestController
@RequestMapping("/follows")
@CrossOrigin("*")
public class FollowController {
	@Autowired
    private FollowService followService;


    @PostMapping("/create")
    public ResponseEntity<Follow> createFollow(@RequestBody Follow follow) {
        return ResponseEntity.ok(followService.saveFollow(follow));
    }

    @GetMapping("/getFollowById/{id}")
    public ResponseEntity<Follow> getFollowById(@PathVariable Long id) {
        return ResponseEntity.ok(followService.findFollowById(id));
    }

    @GetMapping("/getAllFollows")
    public ResponseEntity<List<Follow>> getAllFollows() {
        return ResponseEntity.ok(followService.findAllFollows());
    }

    @DeleteMapping("/deleteFollowById/{id}")
    public ResponseEntity<Void> deleteFollowById(@PathVariable Long id) {
        followService.deleteFollowById(id);
        return ResponseEntity.noContent().build();
    }
}