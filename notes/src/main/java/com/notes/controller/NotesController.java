package com.notes.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notes.entity.Notes;
import com.notes.services.NotesService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class NotesController {
	
	@Autowired
	NotesService notes;
	
	
	@PostMapping(path="/notes",consumes= {"application/json"})
	public boolean addNotes(@RequestBody Notes note ) 
	{
		return this.notes.addNotes(note);
		
	}
	@RequestMapping("/notes/{id}")
	public List<Notes> getNotes(@PathVariable("id") String email)
	{
		return this.notes.getNotes(email);

	}
	@DeleteMapping("/deletenotes/{id}")
	public void deleteNotes(@PathVariable("id") int id)
	{
		notes.deleteNotes(id);;

	}
}
