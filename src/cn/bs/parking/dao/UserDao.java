package cn.bs.parking.dao;

import cn.bs.parking.model.User;

public interface UserDao {

	User find(String loginnumber, String loginpassword);

	int querycount();

	void save(User existUser);

	User findByPhone(String phonenumber);

}
