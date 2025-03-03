package com.tagup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tagup.model.Post;
import com.tagup.model.User;
@Repository
public interface PostRepository  extends JpaRepository<Post, Long> {

	List<Post> findByUser(User user);

	

}