package com.loiane.data;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import com.loiane.model.Param;
import com.loiane.model.Param2;
import com.loiane.model.State;

/**
 * Stored Procedure Mapper contains all the myBatis/iBatis annotations
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public interface SPMapper {

	Object callGetTotalCity(Param param);
	Object callGetTotalCity2(Map<String, Object> param);
	Object callGetTotalCityStateId(Param2 param2);
	List<State> callGetStates();
	
	//--methos bellow are the same as above, but they are using annotations
	
	@Select(value= "{ CALL getTotalCity( #{total, mode=OUT, jdbcType=INTEGER} )}")
	@Options(statementType = StatementType.CALLABLE)
	Object callGetTotalCityAnnotations(Param param); 
	
	@Select(value= "{ CALL getTotalCityStateId( #{stateId, mode=IN, jdbcType=INTEGER}, #{total, mode=OUT, jdbcType=INTEGER})}")
	@Options(statementType = StatementType.CALLABLE)
	Object callGetTotalCityStateIdAnnotations(Param2 param2);
	
	//TODO: set resultMap with annotations
	/*@Select(value= "{ CALL getTotalCityStateId()}")
	@Options(statementType = StatementType.CALLABLE)
	/*@Results(value = {
		@Result(property="id", column="state_id"),
		@Result(property="name", column="state_name"),
		@Result(property="code", column="state_code"),
	})*/
	List<State> callGetStatesAnnotations();
}
