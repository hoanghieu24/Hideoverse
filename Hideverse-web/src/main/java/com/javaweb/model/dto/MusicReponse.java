package com.javaweb.model.dto;

import java.util.Date;


public class MusicReponse {
	private String title;
	private String artist;
	private String duration;
	private String view_count;
	private String genre;
	private Date createdDate;
	private String modifiedBy;
	private String file_music;
	private String image_music;
	
	public String getImage_music() {
		return image_music;
	}
	public void setImage_music(String image_music) {
		this.image_music = image_music;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getView_count() {
		return view_count;
	}
	public void setView_count(String view_count) {
		this.view_count = view_count;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genreEntity) {
		this.genre = genreEntity;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getFile_music() {
		return file_music;
	}
	public void setFile_music(String file_music) {
		this.file_music = file_music;
	}
	
	
	
	
	

}
