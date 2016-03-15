package cn.bs.parking.service;

import cn.bs.parking.model.Time;

public interface DoorService {

	void save(Time time);

	String find();

}
