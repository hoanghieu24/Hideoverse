package com.javaweb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class ArtistEntity extends BaseEntity {
	
	@Column(name = "name", nullable = false) // định nghĩa ánh xạ giữa các thuộc tính trong java với các cột trong db
	private String name;

	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "artistEntity")
    private List<Artist_MusicEntity> atrist_MusicEntities;
    

	List<Artist_MusicEntity> getAtrist_MusicEntities() {
		return atrist_MusicEntities;
	}

	void setAtrist_MusicEntities(List<Artist_MusicEntity> atrist_MusicEntities) {
		this.atrist_MusicEntities = atrist_MusicEntities;
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}
	
	
}