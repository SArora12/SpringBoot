package com.notes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notes.entity.Notes;
import com.notes.repo.NotesRepo;

@Service
public class NotesServiceImp implements NotesService {

	@Autowired
	NotesRepo repo;
	
	@Override
	public boolean addNotes(Notes note) {
		repo.save(note);
		return true;
	}

	@Override
	public List<Notes> getNotes(String email) {
		return repo.findByEmailOrderByDateTimeDesc(email);
		
	}

	@Override
	public void deleteNotes(int id) {
		repo.deleteById(id);		
	}
	

}
