package com.javaweb.entity;
	
	import java.util.List;
	
	import javax.persistence.*;
	
	@Entity
	@Table(name = "music")
	public class MusicEntity extends BaseEntity {
		
		@Column(name = "title", nullable = false) // định nghĩa ánh xạ giữa các thuộc tính trong java với các cột trong db
		private String title;
		
		// genre_id 
		@Column(name = "lyric_text")
		private String lyric_Text;
		
		@Column(name = "duration")
		private String duration;
	
		@Column(name = "view_count")
		private Long view_count;
		
		
		@Column(name = "is_deletes")
		private boolean is_deletes;
		
		@Column(name = "file_music")
		private String file_music;
		
		@Column(name = "image_music")
		private String image_music;
		
		@ManyToOne
	    @JoinColumn(name = "genre_id", nullable = false)
	    private GenreEntity genreId;
		
		@OneToMany(mappedBy = "music" , cascade = {CascadeType.ALL}  , orphanRemoval = true )
	    private List<Artist_MusicEntity> atrist_MusicEntities;
	    
	    @OneToMany(mappedBy = "music")
	    private List<Album_music> album_musics;
	    
	    @OneToMany(mappedBy = "music")
	    private List<Playlist_musicEntity> playlist_MusicEntities;
	    
	    
	    
	
	    
		public List<Album_music> getAlbum_musics() {
			return album_musics;
		}
	
		public void setAlbum_musics(List<Album_music> album_musics) {
			this.album_musics = album_musics;
		}
	
		public List<Artist_MusicEntity> getAtrist_MusicEntities() {
			return atrist_MusicEntities;
		}
	
		public void setAtrist_MusicEntities(List<Artist_MusicEntity> atrist_MusicEntities) {
			this.atrist_MusicEntities = atrist_MusicEntities;
		}
	
		public String getTitle() {
			return title;
		}
	
		public void setTitle(String title) {
			this.title = title;
		}
	
		public String getLyric_Text() {
			return lyric_Text;
		}
	
		public void setLyric_Text(String lyric_Text) {
			this.lyric_Text = lyric_Text;
		}
	
		public String getDuration() {
			return duration;
		}
	
		public void setDuration(String duration) {
			this.duration = duration;
		}
	
		public Long getView_count() {
			return view_count;
		}
	
		public void setView_count(Long view_count) {
			this.view_count = view_count;
		}
	
		public boolean isIs_deletes() {
			return is_deletes;
		}
	
		public void setIs_deletes(boolean is_deletes) {
			this.is_deletes = is_deletes;
		}
	
		public GenreEntity getGenre() {
			return genreId;
		}
	
		public void setGenre(GenreEntity genre) {
			this.genreId = genre;
		}
	
		public String getFile_music() {
			return file_music;
		}
	
		public void setFile_music(String file_music) {
			this.file_music = file_music;
		}
	
		public String getImage_music() {
			return image_music;
		}
	
		public void setImage_music(String image_music) {
			this.image_music = image_music;
		}
	
		public List<Playlist_musicEntity> getPlaylist_MusicEntities() {
			return playlist_MusicEntities;
		}
	
		public void setPlaylist_MusicEntities(List<Playlist_musicEntity> playlist_MusicEntities) {
			this.playlist_MusicEntities = playlist_MusicEntities;
		}
	}
		
		