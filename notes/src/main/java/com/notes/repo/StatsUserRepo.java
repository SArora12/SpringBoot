package com.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notes.entity.Notes;
//import com.notes.entity.Users;

public interface StatsUserRepo<T> extends JpaRepository<Notes, String>{

	
}
