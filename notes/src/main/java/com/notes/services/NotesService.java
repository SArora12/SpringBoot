package com.notes.services;

import java.util.List;


import com.notes.entity.Notes;

public interface NotesService  {
	public boolean addNotes(Notes note );
	public List<Notes> getNotes(String email);
	public void deleteNotes(int id);
}
