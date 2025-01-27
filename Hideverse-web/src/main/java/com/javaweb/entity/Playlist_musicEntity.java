package com.javaweb.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "playlist_music")
public class Playlist_musicEntity extends BaseEntity{
	@ManyToOne
    @JoinColumn(name = "music_id", nullable = false)
    private MusicEntity music;
	
	@ManyToOne
    @JoinColumn(name = "playlist_id", nullable = false)
    private PlaylistEntity playlist ;

	public MusicEntity getMusic() {
		return music;
	}

	public void setMusic(MusicEntity music) {
		this.music = music;
	}

	public PlaylistEntity getPlaylist() {
		return playlist;
	}

	public void setPlaylist(PlaylistEntity playlist) {
		this.playlist = playlist;
	}
	
	
	
}
