package com.oracle.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InsertWorkDao {

	public void insert2(@Param("func_Name") String D1,@Param("charge_Code") String C1);
}
