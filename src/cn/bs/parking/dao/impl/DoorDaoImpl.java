package cn.bs.parking.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bs.parking.dao.DoorDao;
import cn.bs.parking.model.Door;
import cn.bs.parking.model.Time;

public class DoorDaoImpl extends HibernateDaoSupport implements DoorDao {

	@Override
	public void save(Time time) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(time);
	}

	@Override
	public String find() {
		// TODO Auto-generated method stub
		String hql="from Door";
		List<Door> list=this.getHibernateTemplate().find(hql);
		Door door=list.get(0);
		return door.getOpen();
	}
	

}
