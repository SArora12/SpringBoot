package com.notes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notes.entity.Users;
import com.notes.repo.StatsUserRepo;
import com.notes.repo.UserRepo;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired 
	UserRepo repo;
	@Autowired
	StatsUserRepo<String> statsUserRepo;
	
	@Override
	public long getUserCount() {
		return statsUserRepo.count();

	}

	@Override
	public boolean addUsers(Users user) {
		repo.save(user);
		return true;
	}

	@Override
	public Optional<Users> getlogin(String email) {
		return repo.findById(email);
	}
	

}
