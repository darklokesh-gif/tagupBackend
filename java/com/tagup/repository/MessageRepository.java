package com.tagup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tagup.model.Message;
import com.tagup.model.User;

public interface MessageRepository extends JpaRepository<Message, Long> {

	List<Message> findBySender(User sender);

	List<Message> findByReceiver(User receiver);

	

}
