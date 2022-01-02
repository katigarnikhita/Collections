package com.xworkz.Starter;

import com.xworkz.JDBCDAO.ClubDao;
import com.xworkz.jdbcDTO.ClubDto;

public class ClubStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClubDto clubDTO1= new ClubDto(1,"seaclub","chandapura",50);
		ClubDto clubDTO2= new ClubDto(2,"seaclub","chandapura",50);
		ClubDto clubDTO3= new ClubDto(3,"seaclub","chandapura",50);
		ClubDto clubDTO4= new ClubDto(4,"seaclub","chandapura",50);
		ClubDao clubDAO= new ClubDao();
		
		boolean dis=clubDAO.displayById(1);
		//	System.out.println(dis);

			boolean dis1=clubDAO.displayAll();
			System.out.println(dis1);

	}

}
