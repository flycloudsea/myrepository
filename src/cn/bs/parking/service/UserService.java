package cn.bs.parking.service;

import cn.bs.parking.model.User;

public interface UserService {

	User find(String loginnumber, String loginpassword);

	int querycount();

	void save(User existUser);

	User findByPhone(String phonenumber);

}
