package com.tagup.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tagup.model.Follow;
import com.tagup.model.User;
import com.tagup.repository.FollowRepository;

@Service
public class FollowService {
	
	@Autowired
    private FollowRepository followRepository;

  

    public Follow saveFollow(Follow follow) {
        return followRepository.save(follow);
    }

    public List<Follow> findFollowersByUser(User user) {
        return followRepository.findByFollowing(user);
    }

    public List<Follow> findFollowingByUser(User user) {
        return followRepository.findByFollower(user);
    }

    public void deleteFollowById(Long id) {
        followRepository.deleteById(id);
    }

	public Follow findFollowById(Long id) {
		return followRepository.findByFollowerId(id);
	}

	public List<Follow> findAllFollows() {
		return followRepository.findAll();
	}

}