package com.tagup.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tagup.model.Comment;
import com.tagup.model.Post;
import com.tagup.repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Optional<Comment> findCommentById(Long id) {
        return commentRepository.findById(id);
    }

    public List<Comment> findCommentsByPost(Post post) {
        return commentRepository.findByPost(post);
    }

    public void deleteCommentById(Long id) {
        commentRepository.deleteById(id);
    }

	public List<Comment> findAllComments() {
		return commentRepository.findAll();
		
	}

}