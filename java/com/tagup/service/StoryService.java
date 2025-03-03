package com.tagup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tagup.model.Story;
import com.tagup.model.User;
import com.tagup.repository.StoryRepository;

@Service
public class StoryService {
	
	@Autowired
    private StoryRepository storyRepository;

    public Story saveStory(Story story) {
        return storyRepository.save(story);
    }

    public List<Story> findStoriesByUser(User user) {
        return storyRepository.findByUser(user);
    }

    public void deleteStory(Long id) {
        storyRepository.deleteById(id);
    }

	public Optional<Story> findStoryById(Long id) {
		 return storyRepository.findById(id);
	}

	public List<Story> findAllStories() {
		return storyRepository.findAll();
	}
}