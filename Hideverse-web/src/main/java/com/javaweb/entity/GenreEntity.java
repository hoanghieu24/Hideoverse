package com.javaweb.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "genre")
public class GenreEntity extends BaseEntity{

	@Column(name = "name " , nullable = false)
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "genreId")
	    private List<MusicEntity> musics;

	
	public List<MusicEntity> getMusics() {
		return musics;
	}

	public void setMusics(List<MusicEntity> musics) {
		this.musics = musics;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}


	
	
}
