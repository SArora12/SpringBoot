package com.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notes.entity.Users;

public interface UserRepo extends JpaRepository<Users,String> {

	
}
