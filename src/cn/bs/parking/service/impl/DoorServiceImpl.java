package cn.bs.parking.service.impl;

import org.springframework.transaction.annotation.Transactional;

import cn.bs.parking.dao.DoorDao;
import cn.bs.parking.model.Time;
import cn.bs.parking.service.DoorService;
@Transactional
public class DoorServiceImpl implements DoorService{
	DoorDao doorDao;

	public void setDoorDao(DoorDao doorDao) {
		this.doorDao = doorDao;
	}

	@Override
	public void save(Time time) {
		// TODO Auto-generated method stub
		doorDao.save(time);
	}

	@Override
	public String find() {
		// TODO Auto-generated method stub
		return doorDao.find();
	}
	
}
