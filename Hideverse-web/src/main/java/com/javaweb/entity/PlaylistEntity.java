package com.javaweb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "playlist")
public class PlaylistEntity extends BaseEntity {

	@Column(name = "name", nullable = false) // định nghĩa ánh xạ giữa các thuộc tính trong java với các cột trong db
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "playlist")
    private List<Playlist_musicEntity> playlist_musicEntities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Playlist_musicEntity> getPlaylist_musicEntities() {
		return playlist_musicEntities;
	}

	public void setPlaylist_musicEntities(List<Playlist_musicEntity> playlist_musicEntities) {
		this.playlist_musicEntities = playlist_musicEntities;
	}
    
    
    
    
	
	
}
