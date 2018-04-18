package org.jdsc.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.jdsc.dao.UserDao;
import org.jdsc.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao dao;
 
	@Override
	public List<Map> getUser() {
		return this.dao.getUser();
	}
	
}
