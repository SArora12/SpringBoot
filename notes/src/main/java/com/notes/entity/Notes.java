package com.notes.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Notes {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="content",length=500)
	String content;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column( name="date")
    private Date dateTime;
	 
	@Column
	String email;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	public Notes() {
		this.dateTime = new Date();
		// TODO Auto-generated constructor stub
	}
	
	
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Notes(int id, String content, Date dateTime, String email) {
		super();
		this.id = id;
		this.content = content;
		this.dateTime = dateTime;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
   
	
	


}
