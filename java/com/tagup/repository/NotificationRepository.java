package com.tagup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tagup.model.Notification;
@Repository
public interface NotificationRepository  extends JpaRepository<Notification, Long>{

}