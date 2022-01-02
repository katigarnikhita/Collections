package com.xworkz.JDBCDAO;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.xworkz.jdbcDTO.*;

import com.xworkz.DBConstant.DBConstant;
import com.xworkz.jdbcDTO.StateDto;

public class StateDAO {
	Connection mysql;

	public boolean save(StateDto StateDtO)
	{
		
		try
		{
			mysql=DriverManager.getConnection(DBConstant.url,DBConstant.username,DBConstant.password);
		   if(!mysql.isClosed())
		   {
			   String sql="insert into State_detailst values(?,?,?,?)";
			   PreparedStatement preparedStatement = mysql.prepareStatement(sql);
				preparedStatement.setObject(1,StateDto.getSid());
				preparedStatement.setObject(2,StateDto.getSName());   }
	return false;
		
	}
}
