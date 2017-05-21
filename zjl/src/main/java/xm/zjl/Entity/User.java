package xm.zjl.Entity;

import java.io.Serializable;

import com.google.code.ssm.api.CacheKeyMethod;


/**
 * User
 * 
 * @author 朱建立
 *
 */

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//private int age;
	
	private int id;
	private String name;
	
	private String sex;
	
	public User(String sex, String name) {
		super();
		this.sex = sex;
		this.name = name;
	}
	
	public User(int id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public User() {
		super();
	}
	@CacheKeyMethod
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}*/

}
