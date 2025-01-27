package com.javaweb.converter;

import java.util.Map;

import com.javaweb.builder.MusicSearchBuilder;
import com.javaweb.utils.MapUtils;
import org.springframework.stereotype.Component;

@Component
public class MusicSerachBuilderConverter {
	public MusicSearchBuilder toMusicSearchBuilder(Map<String,Object> pargam, String genre) {
		
		MusicSearchBuilder musicSearchBuilder = new MusicSearchBuilder.Builder()
																	.setTitle(MapUtils.getObject(pargam,"title", String.class))
																	.setAtrist(MapUtils.getObject(pargam, "atrist", String.class))
																	.setAlbum(MapUtils.getObject(pargam, "album", String.class))
																	.setGenre(MapUtils.getObject(pargam, "genre", String.class))
																	.setPlayList(MapUtils.getObject(pargam,"playlist",String.class))
																	.setDurationFrom(MapUtils.getObject(pargam,"duration_from",String.class))
																	.setDurationTo(MapUtils.getObject(pargam, "duration_to",String.class))
																	.build();
		return musicSearchBuilder;
	}
}
