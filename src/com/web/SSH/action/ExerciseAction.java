package com.web.SSH.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.web.SSH.beans.Exercise;
import com.web.SSH.service.UserManager;
import com.web.SSH.serviceImpl.UserManagerImpl;

public class ExerciseAction extends ActionSupport{
	private Exercise e;
	private UserManager um = new UserManagerImpl();
	private HttpServletRequest request = ServletActionContext.getRequest();
	private HttpSession session = request.getSession();
	
	public Exercise getE() {
		return e;
	}
	
	public void setE(Exercise e) {
		this.e = e;
	}
	public UserManager getUm() {
		return um;
	}
	public void setUm(UserManager um) {
		this.um = um;
	}
	
	public String getExerciseList() throws Exception {
		List<Exercise> el = new ArrayList<Exercise>();
		el = um.getExercise();
		session.setAttribute("exerciseList", el);
		return SUCCESS;
		
	}
}
