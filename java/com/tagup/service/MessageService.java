package com.tagup.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tagup.model.Message;
import com.tagup.model.User;
import com.tagup.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> findMessagesBySender(User sender) {
        return messageRepository.findBySender(sender);
    }

    public List<Message> findMessagesByReceiver(User receiver) {
        return messageRepository.findByReceiver(receiver);
    }

    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }

	public Optional<Message> findMessageById(Long id) {
		return messageRepository.findById(id);
	}

	public Object findAllMessages() {
		return messageRepository.findAll();
	}
}