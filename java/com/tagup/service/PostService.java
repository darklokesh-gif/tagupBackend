package com.tagup.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tagup.model.Post;
import com.tagup.model.User;
import com.tagup.repository.PostRepository;

@Service
public class PostService {
	 
	@Autowired
    private PostRepository postRepository;

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> findPostById(Long id) {
        return postRepository.findById(id);
    }

    public List<Post> findPostsByUser(User user) {
        return postRepository.findByUser(user);
    }

    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }

	public List<Post> findAllPosts() {
		return postRepository.findAll();
	}

}
