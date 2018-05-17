package org.jdsp.dao;

import java.util.List;

import org.jdsp.pojo.Users;

public interface UsersDao {

	/**
	 * 根据id查询用户信息
	 * @param user_id
	 * @return
	 */
	public List<Users> getUserById(String user_id);
	
	/**
	 * 根据id修改微信授权
	 * @param user_id
	 * @return
	 */
	public int updataUserSetting(Users users);
}
