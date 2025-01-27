package com.javaweb.service;

import java.util.List;
import java.util.Map;

import com.javaweb.model.dto.MusicDTO;
import com.javaweb.model.dto.MusicReponse;


public interface MusicService {
	List<MusicReponse> findAll(Map<String,Object> pargam , String genre);
	void postAll(MusicDTO musicDTO);
	void putAll(MusicDTO musicDTO);
	void deleteAll(Long ids[]);
}
