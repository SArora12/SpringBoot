package com.notes.repo;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.notes.entity.Notes;



@Repository
public interface NotesRepo extends JpaRepository<Notes, Integer>{
	
	List<Notes> findByEmailOrderByDateTimeDesc(String email);
	public List<Notes> findTop10ByOrderByDateTimeDesc();
public void deleteById(int id);
	 @Modifying
	 @Transactional
	 @Query("DELETE FROM Notes n WHERE n.id NOT IN :recentNoteIds")
	public void removeExtra(List<Object> recentNoteIds);
	List<Notes> findByEmail(String email);
	

}