package com.tagup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tagup.model.Story;
import com.tagup.model.User;
@Repository
public interface StoryRepository  extends JpaRepository<Story, Long>{

	List<Story> findByUser(User user);

}