package cn.bs.parking.service.impl;

import org.springframework.transaction.annotation.Transactional;

import cn.bs.parking.dao.UserDao;
import cn.bs.parking.model.User;
import cn.bs.parking.service.UserService;
@Transactional
public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User find(String loginnumber, String loginpassword) {
		// TODO Auto-generated method stub
		return userDao.find(loginnumber,loginpassword);
	}

	@Override
	public int querycount() {
		// TODO Auto-generated method stub
		
		return userDao.querycount();
	}

	@Override
	public void save(User existUser) {
		// TODO Auto-generated method stub
		userDao.save(existUser);
	}

	@Override
	public User findByPhone(String phonenumber) {
		// TODO Auto-generated method stub
		return userDao.findByPhone(phonenumber);
	}

}
