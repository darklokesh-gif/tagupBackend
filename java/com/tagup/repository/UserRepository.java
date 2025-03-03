package com.tagup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tagup.model.User;
@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

}