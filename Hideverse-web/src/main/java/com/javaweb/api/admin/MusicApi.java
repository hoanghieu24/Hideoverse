package com.javaweb.api.admin;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.javaweb.model.dto.MusicDTO;
import com.javaweb.model.dto.MusicReponse;
import com.javaweb.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:5173") 
@RestController
@Transactional
public class MusicApi {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private MusicService musicService;
	
	@GetMapping(value = "/api/musics")
	public Object getMusic(@RequestParam Map<String , Object> pargam , 
						@RequestParam(name = "genre" , required = false) String genre) {
		List<MusicReponse> musicReponses = musicService.findAll(pargam,genre);
		return musicReponses;
	}
	
	@PostMapping(value = "/api/musics")
	// xử lý post
	public void addMusic(@RequestBody MusicDTO md) {
//		validate(ms);
		musicService.postAll(md);
	}
	
	@PutMapping(value = "/api/musics")
	public void editMusic(@RequestBody MusicDTO md) {
		musicService.putAll(md);
	}
	
	@DeleteMapping(value = "/api/musics/{id}")
	public void deleteMusic(@PathVariable(name = "id", required = false) Long musicId[]) {
		musicService.deleteAll(musicId); // Gọi service để xử lý xóa tòa nhà
	}
	
}
