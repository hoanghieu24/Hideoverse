package com.javaweb.repository;


import java.util.List;

import com.javaweb.entity.MusicEntity;
import com.javaweb.repository.custom.MusicRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MusicRepository extends JpaRepository<MusicEntity,Long> , MusicRepositoryCustom {
	List<MusicEntity> findByIdIn(Long[] ids);
	void deleteByIdIn(Long ids[]);
}
