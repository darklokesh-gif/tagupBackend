package com.tagup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tagup.model.Like;
import com.tagup.model.Post;
@Repository
public interface LikeRepository  extends JpaRepository<Like, Long> {

	List<Like> findByPost(Post post);

}