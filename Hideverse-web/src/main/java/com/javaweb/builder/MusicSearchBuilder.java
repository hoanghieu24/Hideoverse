package com.javaweb.builder;

public class MusicSearchBuilder {
	private String title;
	private String atrist;
	private String playlist;
	private String genre ;
	private String album;
	private String durationFrom;
	private String durationTo;
	
	private MusicSearchBuilder(Builder builder) {
		this.title = builder.title;
		this.atrist = builder.atrist;
		this.album = builder.album;
		this.playlist = builder.playlist;
		this.genre = builder.genre;
		this.durationFrom = builder.durationFrom;
		this.durationTo = builder.durationTo;
	}
	
	
	
	public String getDurationFrom() {
		return durationFrom;
	}



	public String getDurationTo() {
		return durationTo;
	}



	public String getTitle() {
		return title;
	}



	public String getAtrist() {
		return atrist;
	}



	public String getPlayList() {
		return playlist;
	}



	public String getGenre() {
		return genre;
	}



	public String getAlbum() {
		return album;
	}



	public static class Builder{
		private String title;
		private String atrist;
		private String playlist;
		private String genre ;
		private String album;
		private String durationFrom;
		private String durationTo;
		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}
		public Builder setAtrist(String atrist) {
			this.atrist = atrist;
			return this;
		}
		public Builder setPlayList(String playlist) {
			this.playlist = playlist;
			return this;
		}
		public Builder setGenre(String genre) {
			this.genre = genre;
			return this;
		}
		public Builder setAlbum(String album) {
			this.album = album;
			return this;
		}
		
		
		public Builder setDurationFrom(String durationFrom) {
			this.durationFrom = durationFrom;
			return this;
		}
		public Builder setDurationTo(String durationTo) {
			this.durationTo = durationTo;
			return this;
		}
		public MusicSearchBuilder build() {
			return new MusicSearchBuilder(this);
		}
		
		
	}
}
