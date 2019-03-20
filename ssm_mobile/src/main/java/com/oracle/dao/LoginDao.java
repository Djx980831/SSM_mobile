package com.oracle.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.oracle.vo.Operator;

@Repository
public interface LoginDao {

	public Operator login(@Param("operator_Name") String operator_Name,@Param("operator_Pwd") String operator_Pwd);
}
