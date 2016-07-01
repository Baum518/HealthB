package me.groupb.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import me.groupb.model.User;
import me.groupb.service.UserService;

@Controller("UserAction")
public class UserAction extends ActionSupport implements RequestAware,SessionAware{
	
	private Map<String , Object> request;
	private Map<String , Object> session;

	
	@Autowired
	private UserService userService;
	
	
	
	public void listUser(){
		List<User> list  =  userService.findUser();
		for(User user:list){
			System.out.println("NickName: "+ user.getNickName());
		}
		
	}
	
	
	
	
	public Map<String, Object> getRequest() {
		return request;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
		
	}
	

}
