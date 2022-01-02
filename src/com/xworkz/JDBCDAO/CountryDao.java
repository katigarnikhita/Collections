package com.xworkz.JDBCDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbcDTO.*;

import com.xworkz.DBConstant.DBConstant;
import com.xworkz.jdbcDTO.CountryDto;

public class CountryDao {
	
	
	Connection mysql;

	
	
	public boolean save(CountryDto CountryDto)
	{
		try
		{
			mysql=DriverManager.getConnection(DBConstant.url, DBConstant.username, DBConstant.password);
		if(!mysql.isClosed())
		{
			String sql="insert into coutry_Details values(?,?,?,?)";
			PreparedStatement preapredStatment=mysql.prepareStatement(sql);
			preapredStatment.setObject(1,((com.xworkz.jdbcDTO.CountryDto) CountryDto).getId());
			preapredStatment.setObject(2, CountryDto.getName());
			preapredStatment.setObject(3, CountryDto.getCode());
			preapredStatment.setObject(4, CountryDto.getContinent());
			System.out.println(sql);
			int roweffected=preapredStatment.executeUpdate();
			System.out.println(roweffected);
			if(roweffected==1)
				return true;
           
		
		}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (mysql.isClosed());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

public boolean deleteById(int id) {
	try {

		Connection mysql = DriverManager.getConnection(DBConstant.url, DBConstant.username,
				DBConstant.password);
		Statement statement = mysql.createStatement();
		String sql = "delete from country_details where c_id=" + id;
		int rowDelete = statement.executeUpdate(sql);
		return true;

	}  catch (SQLException e) {

		e.printStackTrace();
	}
	return false;
}

public boolean displayById(int gid) {

	try {
		Connection mysql = DriverManager.getConnection(DBConstant.url, DBConstant.username,
				DBConstant.password);
		// DBUtil.connectingmysql();
		String sql = "select*from country_details where c_id=" + gid;
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
			return true;
		}

		else {
			System.out.println("record not found");
		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
}

public boolean displayAll() {

	try {
		Connection mysql = DriverManager.getConnection(DBConstant.url, DBConstant.username,
				DBConstant.password);
		// DBUtil.connectingmysql();
		String sql = "select*from country_details";
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
	