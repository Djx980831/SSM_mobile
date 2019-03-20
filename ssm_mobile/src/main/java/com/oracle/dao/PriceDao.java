package com.oracle.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceDao {
	public String getPrice(@Param("charge_Code") String code);
}
