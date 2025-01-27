package com.javaweb.model.dto;


public class MusicDTO extends AbstractDTO{
	
	private String title;
	private Long genreId;
	private Long artistid;
	private String lyric_text;
//	private String duration;
//	private Long view_count;
//	private boolean is_deletes;
	private String image_music;
    private String image_musicBase64;
    private String image_musicName;
    public String getImageBase64() {
        if (image_musicBase64 != null) {
            return image_musicBase64.split(",")[1];
        }
        return null;
    }
    private String file_music;
    private String file_musicBase64;
    private String file_musicName;
    public String getFile_musicBase64() {
        if (file_musicBase64 != null) {
            return file_musicBase64.split(",")[1];
        }
        return null;
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getGenreId() {
		return genreId;
	}
	public void setGenreId(Long genre) {
		this.genreId = genre;
	}

	public Long getArtistid() {
		return artistid;
	}
	public void setArtistid(Long artistid) {
		this.artistid = artistid;
	}
	public String getLyric_text() {
		return lyric_text;
	}
	public void setLyric_text(String lyric_text) {
		this.lyric_text = lyric_text;
	}
//	public String getDuration() {
//		return duration;
//	}
//	public void setDuration(String duration) {
//		this.duration = duration;
//	}
//	public Long getView_count() {
//		return view_count;
//	}
//	public void setView_count(Long view_count) {
//		this.view_count = view_count;
//	}
//	public boolean isIs_deletes() {
//		return is_deletes;
//	}
//	public void setIs_deletes(boolean is_deletes) {
//		this.is_deletes = is_deletes;
//	}
	public String getImage_music() {
		return image_music;
	}
	public void setImage_music(String image_music) {
		this.image_music = image_music;
	}
	public String getImage_musicBase64() {
		return image_musicBase64;
	}
	public void setImage_musicBase64(String image_musicBase64) {
		this.image_musicBase64 = image_musicBase64;
	}
	public String getImage_musicName() {
		return image_musicName;
	}
	public void setImage_musicName(String image_musicName) {
		this.image_musicName = image_musicName;
	}
	public String getFile_music() {
		return file_music;
	}
	public void setFile_music(String file_music) {
		this.file_music = file_music;
	}
	public String getFile_musicName() {
		return file_musicName;
	}
	public void setFile_musicName(String file_musicName) {
		this.file_musicName = file_musicName;
	}
	public void setFile_musicBase64(String file_musicBase64) {
		this.file_musicBase64 = file_musicBase64;
	}
    
    
}
