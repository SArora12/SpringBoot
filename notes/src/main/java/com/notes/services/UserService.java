package com.notes.services;

import java.util.Optional;


import com.notes.entity.Users;

public interface UserService {

	public long getUserCount();
	public boolean addUsers(Users user) ;
	public Optional<Users> getlogin(String email);


}
