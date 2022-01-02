package com.xworkz.jdbcDTO;

public class StateDto {
	
	private int sid;
	private String sname;
	private String scode;
	private String scapital;
	StateDto ()
	{
		
	}
	public StateDto(int sid, String sname, String scode, String scapital) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scode = scode;
		this.scapital = scapital;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getScapital() {
		return scapital;
	}
	public void setScapital(String scapital) {
		this.scapital = scapital;
	}
	@Override
	public String toString() {
		return "StateDto [sid=" + sid + ", sname=" + sname + ", scode=" + scode + ", scapital=" + scapital + "]";
	}
	
	
	
}
