package com.tagup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tagup.model.Message;
import com.tagup.service.MessageService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/messages")
@CrossOrigin("*")
public class MessageController {
	 @Autowired
    private MessageService messageService;

   
    
    @PostMapping("/create")
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        return ResponseEntity.ok(messageService.saveMessage(message));
    }

    @GetMapping("/getMessageById/{id}")
    public ResponseEntity<Optional<Message>> getMessageById(@PathVariable Long id) {
        return ResponseEntity.ok(messageService.findMessageById(id));
    }

    @GetMapping("getAll")
    public ResponseEntity<Object> getAllMessages() {
        return ResponseEntity.ok(messageService.findAllMessages());
    }

    @DeleteMapping("/deleteMessageById/{id}")
    public ResponseEntity<Void> deleteMessageById(@PathVariable Long id) {
        messageService.deleteMessage(id);
        return ResponseEntity.noContent().build();
    }
}