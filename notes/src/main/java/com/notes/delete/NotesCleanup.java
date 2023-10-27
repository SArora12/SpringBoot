package com.notes.delete;


import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.notes.entity.Notes;
import com.notes.repo.NotesRepo;



@Component
public class NotesCleanup {
	
	@Autowired
	NotesRepo repo;
	

	
	@Scheduled(cron = "0 * * * * *") // Run every minute
    @Transactional
    public void deleteOldNotes() {
       

        List<Notes> recentNotes = repo.findTop10ByOrderByDateTimeDesc();

        // Extract the IDs of the recent notes
        List<Object> recentNoteIds = recentNotes.stream().map(Notes::getId).collect(Collectors.toList());

        // Delete notes that are not in the list of recent note IDs
        repo.removeExtra(recentNoteIds);
    }

}