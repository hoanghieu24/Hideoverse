package com.javaweb.repository.custom;

import java.util.List;

import com.javaweb.builder.MusicSearchBuilder;
import com.javaweb.entity.MusicEntity;

public interface MusicRepositoryCustom {
	public List<MusicEntity> findAll(MusicSearchBuilder musicSearchBuilder);

}
