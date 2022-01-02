package com.xworkz.jdbcDTO;

public class ClubDto {
	private int id;
	private String name;
	private String location;
	private int bouncers;
	ClubDto()
	{
		
	}
	public ClubDto(int id, String name, String location, int bouncers) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.bouncers = bouncers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getBouncers() {
		return bouncers;
	}
	public void setBouncers(int bouncers) {
		this.bouncers = bouncers;
	}
	@Override
	public String toString() {
		return "ClubDto [id=" + id + ", name=" + name + ", location=" + location + ", bouncers=" + bouncers + "]";
	}
	
	
	}
	
