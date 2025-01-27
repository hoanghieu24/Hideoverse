package com.javaweb.repository;

import java.util.List;

import com.javaweb.entity.Artist_MusicEntity;
import com.javaweb.entity.MusicEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Artist_MusicEntityRepository extends JpaRepository<Artist_MusicEntity, Long>{
	 List<Artist_MusicEntity> deleteAllByMusicIn(List<MusicEntity> musicEntities);
}
