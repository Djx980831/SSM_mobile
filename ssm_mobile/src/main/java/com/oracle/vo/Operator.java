package com.oracle.vo;

public class Operator {
	
	Integer operator_Id;
	String operator_Name;
	String operator_Pwd;
	String id_Admin;
	
	public Integer getOperator_Id() {
		return operator_Id;
	}
	public void setOperator_Id(Integer operator_Id) {
		this.operator_Id = operator_Id;
	}
	public String getOperator_Name() {
		return operator_Name;
	}
	public void setOperator_Name(String operator_Name) {
		this.operator_Name = operator_Name;
	}
	public String getOperator_Pwd() {
		return operator_Pwd;
	}
	public void setOperator_Pwd(String operator_Pwd) {
		this.operator_Pwd = operator_Pwd;
	}
	public String getId_Admin() {
		return id_Admin;
	}
	public void setId_Admin(String id_Admin) {
		this.id_Admin = id_Admin;
	}
	@Override
	public String toString() {
		return "Operator [operator_Id=" + operator_Id + ", operator_Name=" + operator_Name + ", operator_Pwd="
				+ operator_Pwd + ", id_Admin=" + id_Admin + "]";
	}
	
}
