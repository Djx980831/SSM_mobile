package com.oracle.vo;

import java.sql.Date;

public class Customer {
	Integer customer_Id;
	String id_Type;
	String id_Number;
	String customer_Name;
	String customer_Birth;
	String customer_Addre;
	
	public Integer getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(Integer customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getId_Type() {
		return id_Type;
	}
	public void setId_Type(String id_Type) {
		this.id_Type = id_Type;
	}
	public String getId_Number() {
		return id_Number;
	}
	public void setId_Number(String id_Number) {
		this.id_Number = id_Number;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	
	public String getCustomer_Birth() {
		return customer_Birth;
	}
	public void setCustomer_Birth(String customer_Birth) {
		this.customer_Birth = customer_Birth;
	}
	public String getCustomer_Addre() {
		return customer_Addre;
	}
	public void setCustomer_Addre(String customer_Addre) {
		this.customer_Addre = customer_Addre;
	}
	@Override
	public String toString() {
		return "Customer [customer_Id=" + customer_Id + ", id_Type=" + id_Type + ", id_Number=" + id_Number
				+ ", customer_Name=" + customer_Name + ", customer_Birth=" + customer_Birth + ", customer_Addre="
				+ customer_Addre + "]";
	}
	
	
}
