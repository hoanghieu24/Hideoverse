package com.javaweb.entity;

import javax.persistence.*;

@Entity
@Table(name = "album_music")
public class Album_music extends BaseEntity{
	
	@ManyToOne
    @JoinColumn(name = "music_id", nullable = false)
    private MusicEntity music;
	
	@ManyToOne
    @JoinColumn(name = "album_id", nullable = false)
    private AlbumEntity album ;

	public MusicEntity getMusic() {
		return music;
	}

	public void setMusic(MusicEntity music) {
		this.music = music;
	}

	public AlbumEntity getAlbum() {
		return album;
	}

	public void setAlbum(AlbumEntity album) {
		this.album = album;
	}
	
	
}
