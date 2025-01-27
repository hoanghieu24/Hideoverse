package com.javaweb.converter;

import java.util.stream.Collectors;

import com.javaweb.entity.MusicEntity;
import com.javaweb.model.dto.MusicReponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MusicConverter {
	@Autowired
	private ModelMapper modelMapper;
	
	public MusicReponse convertoReponse(MusicEntity musicEntity) {
		MusicReponse musicReponse = modelMapper.map(musicEntity, MusicReponse.class);
		if (musicEntity.getGenre() != null) {
			musicReponse.setGenre(musicEntity.getGenre().getName());
		}
		
		if (musicEntity.getAtrist_MusicEntities() != null) {
	        String artists = musicEntity.getAtrist_MusicEntities().stream()
	            .map(artistMusic -> artistMusic.getArtistEntity().getName())
	            .collect(Collectors.joining(", "));
	        musicReponse.setArtist(artists);
	    }
		


		return musicReponse;
	}

}
