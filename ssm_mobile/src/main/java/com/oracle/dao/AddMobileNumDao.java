package com.oracle.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddMobileNumDao {

	public void addNum(Map<String,Object>map);

}
