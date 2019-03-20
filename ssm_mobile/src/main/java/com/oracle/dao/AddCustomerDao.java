package com.oracle.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddCustomerDao {
	
	public void add1(@Param("id_Type") String D1,@Param("id_Number") String T2);
	
	public void add2(@Param("customer_Name") String T1,@Param("customer_Birth") String R1,@Param("customer_Sex") String T3,@Param("customer_Addre") String T4,@Param("id_Number") String num);

	// void add3(@Param("mobile_Number") String num,@Param("roaming_Status") String status,@Param("com_Lelel") String lelel,@Param("user_Id") Integer id);

	public void add3(Map<String,Object> map);
	
	public void add4(Map<String,Object> map);
	
}
