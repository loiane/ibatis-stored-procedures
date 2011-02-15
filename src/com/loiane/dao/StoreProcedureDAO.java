package com.loiane.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.loiane.data.SPMapper;
import com.loiane.model.Param;
import com.loiane.model.Param2;
import com.loiane.model.State;

/**
 * StoreProcedure DAO - xml and annotation config
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class StoreProcedureDAO {

	public int callTotalCity(){

		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		
		SPMapper spMapper = session.getMapper(SPMapper.class);
		
		try {
			Param param = new Param();
			spMapper.callGetTotalCity(param);
			return param.getTotal();
		} finally {
			session.close();
		}
	}
	
	public int callTotalCity2(){

		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		
		SPMapper spmapper = session.getMapper(SPMapper.class);
		
		try {
			
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("total", 0);
			spmapper.callGetTotalCity2(param);
			return (Integer) param.get("total");
		} finally {
			session.close();
		}
	}
	
	public int callGetTotalCityStateId(){

		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		
		SPMapper spMapper = session.getMapper(SPMapper.class);
		
		try {
			Param2 param2 = new Param2();
			param2.setStateId(1);
			spMapper.callGetTotalCityStateId(param2);
			return param2.getTotal();
		} finally {
			session.close();
		}
	}
	
	public List<State> callGetStates(){

		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		
		SPMapper spMapper = session.getMapper(SPMapper.class);
		
		try {
			return spMapper.callGetStates();
		} finally {
			session.close();
		}
	}
	
	public int callGetTotalCityAnnotations(){

		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		
		SPMapper spMapper = session.getMapper(SPMapper.class);
		
		try {
			Param param = new Param();
			spMapper.callGetTotalCityAnnotations(param);
			return param.getTotal();
		} finally {
			session.close();
		}
	}
	
	public int callGetTotalCityStateIdAnnotations(){

		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		
		SPMapper spMapper = session.getMapper(SPMapper.class);
		
		try {
			Param2 param2 = new Param2();
			param2.setStateId(1);
			spMapper.callGetTotalCityStateIdAnnotations(param2);
			return param2.getTotal();
		} finally {
			session.close();
		}
	}
	
	public List<State> callGetStatesAnnotations(){

		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		
		SPMapper spMapper = session.getMapper(SPMapper.class);
		
		try {
			return spMapper.callGetStatesAnnotations();
		} finally {
			session.close();
		}
	}
}
