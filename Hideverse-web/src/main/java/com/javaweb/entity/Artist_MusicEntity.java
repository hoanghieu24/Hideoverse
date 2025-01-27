package com.javaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "artist_music")
public class Artist_MusicEntity extends BaseEntity{
	
	@ManyToOne
    @JoinColumn(name = "music_id", nullable = false)
    private MusicEntity music;
	
	@ManyToOne
    @JoinColumn(name = "artist_id", nullable = false)
    private ArtistEntity artistEntity;


	public MusicEntity getMusic() {
		return music;
	}

	public void setMusic(MusicEntity music) {
		this.music = music;
	}

	public ArtistEntity getArtistEntity() {
		return artistEntity;
	}

	public void setArtistEntity(ArtistEntity artistEntity) {
		this.artistEntity = artistEntity;
	}
	
	
	
}
