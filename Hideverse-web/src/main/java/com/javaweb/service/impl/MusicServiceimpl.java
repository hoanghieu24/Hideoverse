package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

import com.javaweb.builder.MusicSearchBuilder;
import com.javaweb.converter.MusicConverter;
import com.javaweb.converter.MusicSerachBuilderConverter;
import com.javaweb.entity.ArtistEntity;
import com.javaweb.entity.Artist_MusicEntity;
import com.javaweb.entity.GenreEntity;
import com.javaweb.entity.MusicEntity;
import com.javaweb.model.dto.MusicDTO;
import com.javaweb.model.dto.MusicReponse;
import com.javaweb.repository.Artist_MusicEntityRepository;
import com.javaweb.repository.MusicRepository;
import com.javaweb.service.MusicService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MusicServiceimpl implements MusicService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private MusicSerachBuilderConverter musicSerachBuilderConverter;
	
	@Autowired
	private MusicRepository musicRepository;
	
	@Autowired
	private MusicConverter musicConverter;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private Artist_MusicEntityRepository artist_MusicEntityRepository;

	
	// tìm kiếm 
	@Override
	public List<MusicReponse> findAll(Map<String, Object> pargam, String genre) {
		MusicSearchBuilder musicSearchBuilder = musicSerachBuilderConverter.toMusicSearchBuilder(pargam, genre);
		List<MusicEntity> musicEntities = musicRepository.findAll(musicSearchBuilder);
		List<MusicReponse> musicReponses = new ArrayList<>();
		for(MusicEntity me : musicEntities) {
			musicReponses.add(musicConverter.convertoReponse(me));
		}
		return musicReponses;
	}
	
	
	
	// thêm nhạc 
	@Override
	public void postAll(MusicDTO musicDTO) {
	    MusicEntity musicEntity = modelMapper.map(musicDTO, MusicEntity.class);

	    // Lấy thông tin artist từ DB
	    ArtistEntity artistEntity = entityManager.getReference(ArtistEntity.class, musicDTO.getArtistid());

	    if (artistEntity != null) {
	        Artist_MusicEntity artistMusicEntity = new Artist_MusicEntity();
	        artistMusicEntity.setMusic(musicEntity);
	        artistMusicEntity.setArtistEntity(artistEntity);

	        // Kiểm tra và khởi tạo nếu danh sách đang null
	        if (musicEntity.getAtrist_MusicEntities() == null) {
	            musicEntity.setAtrist_MusicEntities(new ArrayList<>());
	        }

	        musicEntity.getAtrist_MusicEntities().add(artistMusicEntity);
	    }

	    musicRepository.save(musicEntity);
	}


	
	// sửa nhạc 
	@Override
	public void putAll(MusicDTO musicDTO) {
	    // Kiểm tra đầu vào để tránh lỗi null
	    if (musicDTO.getId() == null) {
	        throw new IllegalArgumentException("ID không được để trống");
	    }

	    // Tìm kiếm musicEntity trong DB
	    MusicEntity musicEntity = entityManager.find(MusicEntity.class, musicDTO.getId());
	    if (musicEntity == null) {
	        throw new EntityNotFoundException("Không tìm thấy Music với ID: " + musicDTO.getId());
	    }

	    // Cập nhật thông tin từ DTO vào entity
	    musicEntity.setTitle(musicDTO.getTitle());
//	    musicEntity.setDuration(musicDTO.getDuration());
//	    musicEntity.setLyricText(musicDTO.getLyricText());
	    GenreEntity genre = entityManager.find(GenreEntity.class, musicDTO.getGenreId());
	    musicEntity.setGenre(genre);
	    musicEntity.setModifiedDate(new Date());

	    // Cập nhật danh sách artist nếu có
	    if (musicDTO.getArtistid() != null) {
	        ArtistEntity artistEntity = entityManager.find(ArtistEntity.class, musicDTO.getArtistid());
	        if (artistEntity != null) {
	            Artist_MusicEntity artistMusicEntity = new Artist_MusicEntity();
	            artistMusicEntity.setMusic(musicEntity);
	            artistMusicEntity.setArtistEntity(artistEntity);

	            if (musicEntity.getAtrist_MusicEntities() == null) {
	                musicEntity.setAtrist_MusicEntities(new ArrayList<>());
	            }

	            musicEntity.getAtrist_MusicEntities().clear(); // Xóa cũ nếu cần
	            musicEntity.getAtrist_MusicEntities().add(artistMusicEntity);
	        }
	    }
	    musicRepository.save(musicEntity);
	}


	// xoá nhạc 
	@Override
	public void deleteAll(Long[] ids) {
		// TODO Auto-generated method stub
				try {
		            List<MusicEntity> musicEntities = musicRepository.findByIdIn(ids);
		            if(artist_MusicEntityRepository != null){
		            	artist_MusicEntityRepository.deleteAllByMusicIn(musicEntities);
//		                System.out.println(rentareaRepository.deleteAllByBuildingIn(buildingEntities));
		            }
		            musicRepository.deleteByIdIn(ids);
		        } catch (Exception e) {
		            throw new RuntimeException("Xoá Lỗi rồi", e);
		        }
		
	}


	
	
	




	

}
