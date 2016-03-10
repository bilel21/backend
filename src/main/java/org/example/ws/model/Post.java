package org.example.ws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Post {

	@Id
	@GeneratedValue
	private Long id;
    
	private String name;
    
    private String resume;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}  
}
