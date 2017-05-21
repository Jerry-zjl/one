package xm.zjl.interf;

import xm.zjl.Entity.User;

import com.google.code.ssm.api.ParameterDataUpdateContent;
import com.google.code.ssm.api.ParameterValueKeyProvider;

/**
 * 测试memcached缓存
 * 
 * @author 朱建立
 *
 */
public interface MemcachedTestService {
	
	public User getUserById(String id);
	
	public void saveLoginPerson(User lpBean);
	
	public void updatePerson(@ParameterValueKeyProvider @ParameterDataUpdateContent User lpBean);
    
    public void deletePerson(@ParameterValueKeyProvider String personId);
	
}
