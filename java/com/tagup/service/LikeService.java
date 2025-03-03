package com.tagup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tagup.model.Like;
import com.tagup.model.Post;
import com.tagup.repository.LikeRepository;

@Service
public class LikeService {
	
	
	@Autowired
    private LikeRepository likeRepository;

    public Like saveLike(Like like) {
        return likeRepository.save(like);
    }

    public List<Like> findLikesByPost(Post post) {
        return likeRepository.findByPost(post);
    }

    public void deleteLikeById(Long id) {
        likeRepository.deleteById(id);
    }

	public Optional<Like> findLikeById(Long id) {
		return likeRepository.findById(id);
	}

	public List<Like> findAllLikes() {
		return likeRepository.findAll();
	}

	
}