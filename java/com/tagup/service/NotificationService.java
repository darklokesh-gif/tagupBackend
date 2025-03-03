package com.tagup.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tagup.model.Notification;
import com.tagup.repository.NotificationRepository;


@Service
public class NotificationService {
	
	@Autowired
    private NotificationRepository notificationRepository;

    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Notification findNotificationById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }

    public List<Notification> findAllNotifications() {
        return notificationRepository.findAll();
    }

    public void deleteNotificationById(Long id) {
        notificationRepository.deleteById(id);
    }
}