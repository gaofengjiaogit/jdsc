package org.jdsp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.jdsp.dao.UsersDao;
import org.jdsp.pojo.Users;
import org.jdsp.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersDao usersDao;
	
	/**
	 * 根据id查询用户信息
	 * @param user_id
	 * @return
	 */
	@Override
	public List<Users> getUserById(String user_id) {
		return this.usersDao.getUserById(user_id);
	}

	/**
	 * 根据id修改微信授权
	 * @param user_id
	 * @return
	 */
	@Override
	public int updataUserSetting(Users users) {
		return this.usersDao.updataUserSetting(users);
	}

}
