package xm.zjl.dao;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;


/**
 * 基础dao
 * 
 * @author zjl
 *
 * @param <T>
 */
public interface BaseDao<T>{
	public  NamedParameterJdbcTemplate namedParameterJdbcTemplate = null;
	SimpleJdbcTemplate simpleJdbcTemplate = null;
	
}
