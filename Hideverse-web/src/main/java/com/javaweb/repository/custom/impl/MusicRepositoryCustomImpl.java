package com.javaweb.repository.custom.impl;

import java.lang.reflect.Field;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.javaweb.builder.MusicSearchBuilder;
import com.javaweb.entity.MusicEntity;
import com.javaweb.repository.custom.MusicRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;


@Repository
public class MusicRepositoryCustomImpl  implements MusicRepositoryCustom {
	 @PersistenceContext
	    private EntityManager entityManager;
	 
	public List<MusicEntity> findAll(MusicSearchBuilder musicSearchBuilder) {
		 	StringBuilder sql = new StringBuilder("SELECT M.* FROM music AS M ");
	        StringBuilder join = new StringBuilder("");
	        StringBuilder where = new StringBuilder(" WHERE 1=1 ");
	        queryJoin(musicSearchBuilder, join);
	        queryNomal(musicSearchBuilder, where);
	        querySpecial(musicSearchBuilder, where);
	        sql.append(join).append(where).append(" GROUP BY M.id");
	        System.out.println(sql);
	        Query query = entityManager.createNativeQuery(sql.toString(), MusicEntity.class);
	       

	        return query.getResultList();
	}
	// Kiểm tra câu Join
    public void queryJoin(MusicSearchBuilder musicSearchBuilder, StringBuilder join) {
    	String title = musicSearchBuilder.getTitle();
    	String astrist = musicSearchBuilder.getAtrist();
        if (title != null || astrist != null ) {
            join.append(" JOIN artist_music AS am ON M.id = am.music_id JOIN artist AS a ON am.artist_id = a.id ");
        }
        String genre = musicSearchBuilder.getGenre();
        if(genre != null) {
        	join.append(" JOIN genre AS g ON M.genre_id = g.id ");
        }
        String album = musicSearchBuilder.getAlbum();
        if(album != null) {
        	join.append(" JOIN album_music as ams on m.id = ams.music_id join album as al on al.id = ams.album_id ");
        }
        String playlist = musicSearchBuilder.getPlayList();
        if(playlist != null) {
        	join.append(" JOIN playlist_music as p on m.id = p.music_id join playlist as pl on pl.id = p.playlist_id ");
        }
    }

    // Kiểm tra câu query đơn giản
    public void queryNomal(MusicSearchBuilder musicSearchBuilder, StringBuilder where) {
    	try {
            Field[] fields = MusicSearchBuilder.class.getDeclaredFields(); // biến 1 object thành 1 mảng để duyệt 
            																  //bằng getDeclaredFields để truy cập vào các field được khai báo trong class 
            																  //và 	Không bao gồm các trường kế thừa  
            for (Field field : fields) { // duyệt qua từng field
                field.setAccessible(true); // để truy cập vào các field private 
                String key = field.getName(); // lấy tên của các field

                if (!key.equals("atrist") && !key.equals("genre") && !key.startsWith("album")
                        && !key.startsWith("duration")  && !key.equals("playlist")) { // bỏ qua những field xử lý phức tạp 
                    Object value = field.get(musicSearchBuilder); // lấy dữ liệu của các field từ buildingSearchBuilder
                    if (value != null) { // Kiểm tra nếu không phải null
                        String trimmedValue =  value.toString().trim().replaceAll("\\s+", " ");// Loại bỏ khoảng trắng đầu/cuối

                        if (!trimmedValue.isEmpty()) { // Nếu giá trị không rỗng sau khi loại khoảng trắng
                            if (field.getType().getName().equals("java.lang.Integer") || field.getType().getName().equals("java.lang.Long")) {
                                where.append(" AND M." + key + " = " + trimmedValue);
                            } else {
                                where.append(" AND M." + key + " LIKE '%" + trimmedValue + "%'");
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Kiểm tra câu query phức tạp
    public void querySpecial(MusicSearchBuilder musicSearchBuilder, StringBuilder where) {
    	String durationTo = musicSearchBuilder.getDurationTo();
        String durationFrom = musicSearchBuilder.getDurationFrom();
  
        if (durationFrom != null || durationTo != null) {
            if (durationFrom != null) {
                where.append(" AND STR_TO_DATE(M.duration, '%H:%i') >= STR_TO_DATE('"  + durationFrom  + "', '%H:%i')");
            }
            if (durationTo != null) {
                where.append(" AND STR_TO_DATE(M.duration, '%H:%i') <= STR_TO_DATE('" + durationTo  + "', '%H:%i')");
            }
        }
        String astrist = musicSearchBuilder.getAtrist();
        if(astrist != null) {
        	 where.append(" AND a.name " + "LIKE'%" + astrist + "%'");
        }
        String genre = musicSearchBuilder.getGenre();
        if(genre != null) {
        	 where.append(" AND g.name " + "LIKE'%" + genre + "%'");
        }
        String album = musicSearchBuilder.getAlbum();
        if(album != null) {
        	 where.append(" AND al.name " + "LIKE'%" + album + "%'");
        }
        String playlist = musicSearchBuilder.getPlayList();
        if(playlist != null) {
        	 where.append(" AND pl.name " + "LIKE'%" + playlist + "%'");
        }
    }

  



}