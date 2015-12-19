package com.web.SSH.action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.web.SSH.beans.UserLogin;
import com.web.SSH.service.UserManager;
import com.web.SSH.serviceImpl.UserManagerImpl;

public class LoginAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserLogin user;
	private UserManager userManager;
	
	public UserLogin getUser() {
		return user;
	}


	public void setUser(UserLogin user) {
		this.user = user;
	}


	public UserManager getUserManager() {
		return userManager;
	}


	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}


	public String login() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
//		HashMap hm = new HashMap();
//		hm.put("username", user.getUsername());
//		hm.put("password", user.getPassword());
		System.out.println(user.getUsername()+user.getPassword());
		HttpSession session = request.getSession();
		session.setAttribute("username", user.getUsername());
		session.setAttribute("user", user);
		userManager = new UserManagerImpl();
		Boolean validLogin = userManager.userLogin(user.getUsername(),user.getPassword());
		System.out.println("bbbbb"+session.getAttribute("username"));
		System.out.println("bbbbb"+session.getAttributeNames());
		if (validLogin) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	};
}
