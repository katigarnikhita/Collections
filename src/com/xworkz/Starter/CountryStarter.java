package com.xworkz.Starter;

import com.xworkz.JDBCDAO.CountryDao;
import com.xworkz.jdbcDTO.CountryDto;

public class CountryStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryDto countryDto = new  CountryDto(1,"india",91,"Asia");
		CountryDto countryDto1 = new  CountryDto(2,"russai",96,"Europe");
		CountryDto countryDto2 = new  CountryDto(3,"UK",97,"europe");
		CountryDto countryDto3 = new  CountryDto(4,"USA",81,"southamerica");

		CountryDao countryDao = new CountryDao();
//		countryDao.save(countryDto);
//		countryDao.save(countryDto1);
//		countryDao.save(countryDto2);
//		countryDao.save(countryDto3);

		boolean dis=countryDao.displayById(4);
		System.out.println(dis);
	//		boolean dis1=countryDao.displayAll();
	//		System.out.println(dis1);

	//	boolean del = countryDao.deleteById(1);
	//	System.out.println(del);


	}


	}


