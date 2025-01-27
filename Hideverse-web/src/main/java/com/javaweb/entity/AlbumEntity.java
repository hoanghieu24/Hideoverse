package com.javaweb.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "album")
public class AlbumEntity extends BaseEntity{

	@Column(name = "name", nullable = false) // định nghĩa ánh xạ giữa các thuộc tính trong java với các cột trong db
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "album")
    private List<Album_music> album_musics;

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

	public List<Album_music> getAlbum_musics() {
		return album_musics;
	}

	public void setAlbum_musics(List<Album_music> album_musics) {
		this.album_musics = album_musics;
	}
    
    
	
	
}
