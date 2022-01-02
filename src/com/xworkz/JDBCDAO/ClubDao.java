package com.xworkz.JDBCDAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.DBConstant.DBConstant;
import com.xworkz.jdbcDTO.ClubDto;
import com.xworkz.jdbcDTO.*;

public class ClubDao {
        Connection mysql;

	
	public boolean save(ClubDto ClubDto)
	{
		try
		{
			mysql=DriverManager.getConnection(DBConstant.url,DBConstant.username,DBConstant.password);
    	if(!mysql.isClosed())
    	{
    		String sql = "insert into clubDetails values(?,?,?,?)";
    		PreparedStatement preparedStatement=mysql.prepareStatement(sql);
    	
		
    		preparedStatement.setObject(1, ClubDto.getId());
			preparedStatement.setObject(2, ClubDto.getName());
			preparedStatement.setObject(3, ClubDto.getLocation());
			preparedStatement.setObject(4, ClubDto.getBouncers());
			
			System.out.println(sql);
			int rowEffected = preparedStatement.executeUpdate();
			System.out.println(rowEffected);
			if (rowEffected == 1)
				return true;
			}
	}  catch (SQLException e) {

		e.printStackTrace();
	}
	finally {
		try {
			if (mysql.isClosed());
		} catch (SQLException e) {
			e.printStackTrace();
	}
	}return false;
	public boolean deleteById(int id) {
		try {

			 mysql = DriverManager.getConnection(DBConstants.MY_URL, DBConstants.USERNAME,
					DBConstants.PASSWORD);
			Statement statement = mysql.createStatement();
			String sql = "delete from clubDetails where cid=" + id;
			int rowDelete = statement.executeUpdate(sql);
			// if(rowDelete == 1) return true;
			// System.out.println(rowDelete);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean displayById(int gid) {

		try {
		 mysql = DriverManager.getConnection(DBConstant.url, DBConstant.username,
					DBConstant.password);

			String sql = "select*from clubDetails where cid=" + gid;
			PreparedStatement stmt = mysql.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				Object obj1 = result.getObject(1);
				System.out.println(obj1);
				Object obj2 = result.getObject(2);
				System.out.println(obj2);
				Object obj3 = result.getObject(3);
				System.out.println(obj3);
				Object obj4 = result.getObject(4);
				System.out.println(obj4);

			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean displayAll() {

		try {
		 mysql = DriverManager.getConnection(DBConstant.url, DBConstant.username,
					DBConstant.password);
			// DBUtil.connectingmysql();
			String sql = "select*from clubDetails";
			PreparedStatement stmt = mysql.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				Object obj1 = result.getObject(1);
				System.out.println(obj1);
				Object obj2 = result.getObject(2);
				System.out.println(obj2);
				Object obj3 = result.getObject(3);
				System.out.println(obj3);
				Object obj4 = result.getObject(4);
				System.out.println(obj4);

			}
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;

	

	

}

			
			
			
			
			
			
			
			
			
}