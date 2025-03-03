package com.tagup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tagup.model.Follow;
import com.tagup.model.User;

@Repository
public interface FollowRepository  extends JpaRepository<Follow, Long> {

	List<Follow> findByFollowing(User user);

	List<Follow> findByFollower(User user);

	@Query(value = "select f.* from follow f inner join user u on f.follower_id=u.id", nativeQuery = true)
	Follow findByFollowerId(Long id);

}