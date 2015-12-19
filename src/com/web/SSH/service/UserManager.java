package com.web.SSH.service;

import java.util.List;

import com.web.SSH.beans.Exercise;

public interface UserManager {
	public Boolean userLogin(String username,String password) throws Exception;
	public List<Exercise> getExercise() throws Exception;
	public Boolean insertExercise(Exercise e) throws Exception;
}
