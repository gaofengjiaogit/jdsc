package org.jdsp.dao;

import java.util.List;

import org.jdsp.pojo.Users;

public interface UsersDao {

	/**
	 * ����id��ѯ�û���Ϣ
	 * @param user_id
	 * @return
	 */
	public List<Users> getUserById(String user_id);
	
	/**
	 * ����id�޸�΢����Ȩ
	 * @param user_id
	 * @return
	 */
	public int updataUserSetting(Users users);
}
