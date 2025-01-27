package com.javaweb.utils;

import java.util.Map;

public class MapUtils {
	public static <T> T getObject(Map<String, Object> param, String key , Class<T> tClass) {

		Object value = param.getOrDefault(key,null);
		if(value != null) {
			if(tClass.getTypeName().equals("java.lang.Long")) {
				value = value != " " ? Long.valueOf(value.toString().trim()) : null ;
			}else if (tClass.getTypeName().equals("java.lang.Integer")) {
				value = value != " " ? Integer.valueOf(value.toString().trim()) : null ;
			}else if (tClass.getTypeName().equals("java.lang.String")) {
				value = value != " " ? value.toString() : null ;
			}
			return tClass.cast(value);

		}


		return null;
	}

	public static <T> T getObject(Object item, Class<T> tClass) {
		if(item != null) {
			if(tClass.getTypeName().equals("java.lang.Long")) {
				item = item != "" ? Long.valueOf(item.toString()) : null;
			}
			else if(tClass.getTypeName().equals("java.lang.Integer")) {
				item = item != "" ? Integer.valueOf(item.toString()) : null;
			}
			else if(tClass.getTypeName().equals("java.lang.String")) {
				item = item.toString();
			}
			return tClass.cast(item);
		}
		return null;
	}
}
