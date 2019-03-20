package com.oracle.vo;

public class Charge {
	String charge_Code;
	String charge_Name;
	Integer charge;
	public String getCharge_Code() {
		return charge_Code;
	}
	public void setCharge_Code(String charge_Code) {
		this.charge_Code = charge_Code;
	}
	public String getCharge_Name() {
		return charge_Name;
	}
	public void setCharge_Name(String charge_Name) {
		this.charge_Name = charge_Name;
	}
	public Integer getCharge() {
		return charge;
	}
	public void setCharge(Integer charge) {
		this.charge = charge;
	}
	@Override
	public String toString() {
		return "Charge [charge_Code=" + charge_Code + ", charge_Name=" + charge_Name + ", charge=" + charge + "]";
	}
	
}
