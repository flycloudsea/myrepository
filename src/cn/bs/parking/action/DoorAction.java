package cn.bs.parking.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.bs.parking.model.Time;
import cn.bs.parking.model.User;
import cn.bs.parking.service.DoorService;
import cn.bs.parking.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class DoorAction extends ActionSupport {
	
	DoorService doorService;
	UserService userService;
	User user=new User();
	Time time=new Time();
	

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setDoorService(DoorService doorService) {
		this.doorService = doorService;
	}
	public String open(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String phone=request.getParameter("phone");
		System.out.println(phone);
		user=userService.findByPhone(phone);
		System.out.println(user);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String begin=new Date().toString();
		time.setBegin(begin);
		time.setUid(user.getUid());
		doorService.save(time);
		String doorstatus=doorService.find();
		ServletActionContext.getRequest().getSession().setAttribute("open", doorstatus);
		System.out.println("1");
		return "opensuccess";
	}
}
