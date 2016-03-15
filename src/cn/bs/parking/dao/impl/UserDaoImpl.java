package cn.bs.parking.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bs.parking.dao.UserDao;
import cn.bs.parking.model.Parkingcount;
import cn.bs.parking.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User find(String loginnumber, String loginpassword) {
		// TODO Auto-generated method stub
		String hql="from User u where u.phonenumber = ? and u.password = ?";
		List<User> list=this.getHibernateTemplate().find(hql, loginnumber,loginpassword);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public int querycount() {
		// TODO Auto-generated method stub
		String hql="from Parkingcount p where p.Pid=1";
		List<Parkingcount> count=this.getHibernateTemplate().find(hql);
		if(count!=null&&count.size()>0){
			return count.get(0).getParkingcount();
		}
		return -1;
	}

	@Override
	public void save(User existUser) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(existUser);
	}

	@Override
	public User findByPhone(String phonenumber) {
		// TODO Auto-generated method stub
		String hql="from User u where u.phonenumber = ?";
		List<User> list = this.getHibernateTemplate().find(hql,phonenumber);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
