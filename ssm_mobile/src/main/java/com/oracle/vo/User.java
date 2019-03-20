package com.oracle.vo;

public class User {

	Integer userId;
	String mobile_Number;
	String roaming_Status;
	String com_Lelel;
	Integer customer_Id;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getMobile_Number() {
		return mobile_Number;
	}
	public void setMobile_Number(String mobile_Number) {
		this.mobile_Number = mobile_Number;
	}
	public String getRoaming_Status() {
		return roaming_Status;
	}
	public void setRoaming_Status(String roaming_Status) {
		this.roaming_Status = roaming_Status;
	}
	public String getCom_Lelel() {
		return com_Lelel;
	}
	public void setCom_Lelel(String com_Lelel) {
		this.com_Lelel = com_Lelel;
	}
	public Integer getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(Integer customer_Id) {
		this.customer_Id = customer_Id;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", mobile_Number=" + mobile_Number + ", roaming_Status=" + roaming_Status
				+ ", com_Lelel=" + com_Lelel + ", customer_Id=" + customer_Id + "]";
	}
	
	
	
}
