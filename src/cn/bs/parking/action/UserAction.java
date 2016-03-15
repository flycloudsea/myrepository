package cn.bs.parking.action;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.bs.parking.model.User;
import cn.bs.parking.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	
	private User existUser=new User();
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String login(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String loginnumber=request.getParameter("loginnumber");
		String loginpassword=request.getParameter("loginpassword");
		String jsonResult=null;
		
		existUser=userService.find(loginnumber,loginpassword);
		StringBuilder builder=new StringBuilder();
		if(existUser!=null){
			
				
				builder.append("[{");
				builder.append("\"name\":\"").append(existUser.getName()).append("\",");
				builder.append("\"password\":\"").append(existUser.getPassword()).append("\",");
				builder.append("\"phonenumber\":\"").append(existUser.getPhonenumber()).append("\",");
				builder.append("\"license\":\"").append(existUser.getLicense()).append("\"");
				builder.append("}]");
			
		}
		
			jsonResult=builder.toString();
			request.setAttribute("json", jsonResult);
			return SUCCESS;
		
		
	}
	public String querycount(){
		HttpServletRequest request=ServletActionContext.getRequest();
		
			int count=userService.querycount();
			request.setAttribute("count", String.valueOf(count));
			return "querysuccess";
		
	}
	public String register(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String phonenumber=request.getParameter("phone");
		String license=request.getParameter("license");
		existUser.setName(name);
		existUser.setPassword(password);
		existUser.setPhonenumber(phonenumber);
		existUser.setLicense(license);
		User user=userService.findByPhone(phonenumber);
		if(user!=null){
			request.setAttribute("user","exist");
			System.out.println("yes");
		}else{
			userService.save(existUser);
			request.setAttribute("user","unexist");
			System.out.println("no");
		}
		return "registersuccess";
	}

}
