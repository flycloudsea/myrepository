package cn.bs.parking.dao;

import cn.bs.parking.model.Time;

public interface DoorDao {

	void save(Time time);

	String find();

}
