package xm.zjl.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import xm.zjl.Entity.User;
import xm.zjl.interf.MemcachedTestService;

import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughSingleCache;

/**实现类
 * @author 朱建立
 *
 */
@Service("memcachedTestService")
public class MemcachedTestImplService implements MemcachedTestService {
	

	private static final String NAMESPACE = "zhujianli";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private Map<String,User> person = new HashMap<String,User>();
	
	@ReadThroughSingleCache(namespace = NAMESPACE, expiration = 600)
	public User getUserById(@ParameterValueKeyProvider String id) {
		String sql  = " select * from t_user where id ="+id;
		User user = (User) jdbcTemplate.query(sql, new RowMapper() {
			User user = new User();
			public Object mapRow(ResultSet arg0, int arg1) throws SQLException {
				System.out.println("-------------------------------lll");
				while(arg0.next()){
					user.setName(arg0.getString("phone"));
				}
				return user;
			}
		});
		return person.get(id);
	}
	//@ReadThroughSingleCache(namespace=NAMESPACE,expiration = 600)
	public void saveLoginPerson(User user) {
		person.put(user.getId()+"", user);
	}

	public void updatePerson(User lpBean) {
		// TODO Auto-generated method stub
		
	}

	public void deletePerson(String personId) {
		// TODO Auto-generated method stub
		
	}

}
