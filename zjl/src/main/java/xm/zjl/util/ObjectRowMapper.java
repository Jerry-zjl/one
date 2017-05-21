package xm.zjl.util;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * 工具
 * 
 * @author zjl
 * @param <T>
 *
 */
public class ObjectRowMapper<T> implements RowMapper<T> {
	
	private Class<T> clazz;
	

	public T mapRow(ResultSet rs, int rowNum) throws SQLException {
		Object obj = new Object();
		Type genType = this.getClass();
		if (!(genType instanceof ParameterizedType)) {    
			           return (T) Object.class;    
		}    
		Type[] params = ( (ParameterizedType) genType).getActualTypeArguments();
		this.clazz = (Class<T>) params[0];
		System.out.println(params[0]);
		Field[] fields = clazz.getDeclaredFields();
		try {
			obj = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return (T) obj;
	}

}
