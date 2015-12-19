package com.web.SSH.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.SSH.DaoImpl.DaoImpl;
import com.web.SSH.beans.Exercise;
import com.web.SSH.dao.Dao;
import com.web.SSH.service.UserManager;

public class UserManagerImpl implements UserManager{
	private Dao dao = new DaoImpl();
	@Override
	public Boolean userLogin(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		String querysql = "select * from users where username = ? and password = ?";
		PreparedStatement pstmt = dao.getConn().prepareStatement(querysql);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		ResultSet rst = pstmt.executeQuery();
		if(rst.next()){
			return true;
		} else {
			return false;
		}
	}
	
	public List<Exercise> getExercise() throws Exception {
		List<Exercise> exerciseList = new ArrayList<Exercise>();
		String querysql = "select * from exercise_record";
		PreparedStatement pstmt = dao.getConn().prepareStatement(querysql);
		ResultSet rst = pstmt.executeQuery();
		while(rst.next()) {
			Exercise exercise = new Exercise();
			exercise.setId(rst.getInt("id"));
			exercise.setExerciseName(rst.getString("exerciseName"));
			exercise.setExerciseDesc(rst.getString("exerciseDesc"));
			exercise.setCreatedAt(rst.getDate("createdAt"));
			exerciseList.add(exercise);
		}
		return exerciseList;
	}

	@Override
	public Boolean insertExercise(Exercise e) throws Exception {
		// TODO Auto-generated method stub
		String insertsql = "insert into exercise_record(exerciseName, exerciseDesc, createdAt) values (?,?,?)";
		PreparedStatement pstmt = dao.getConn().prepareStatement(insertsql);
		pstmt.setString(1, e.getExerciseName());
		pstmt.setString(2, e.getExerciseDesc());
		pstmt.setDate(3, e.getCreatedAt());
		int i = pstmt.executeUpdate();
		if ( i == 0) {
			return false;
		}
		return true;
	}
	
	

}
