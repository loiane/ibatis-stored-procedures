package com.loiane.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.loiane.dao.StoreProcedureDAO;

/**
 * Test Case
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class TestStoredProcedureDAO {
	
	private static StoreProcedureDAO storeProcedureDAO;

	@BeforeClass
	public static  void runBeforeClass() {
		storeProcedureDAO = new StoreProcedureDAO();
	}

	@AfterClass
	public static void runAfterClass() {
		storeProcedureDAO = null;
	}

	/**
	 * Test method for {@link com.loiane.dao.StoreProcedureDAO#callTotalCity()}.
	 */
	@Test
	public void testCallTotalCity() {
		
		assertEquals("Call getTotalCity", 5507, storeProcedureDAO.callTotalCity());
	}
	
	/**
	 * Test method for {@link com.loiane.dao.StoreProcedureDAO#callTotalCity2()}.
	 */
	@Test
	public void testCallTotalCity2() {
		
		assertEquals("Call getTotalCity2", 5507, storeProcedureDAO.callTotalCity2());
	}
	
	/**
	 * Test method for {@link com.loiane.dao.StoreProcedureDAO#callTotalCity2()}.
	 */
	@Test
	public void testCallGetTotalCityStateId() {
		
		assertEquals("Call callGetTotalCityStateId", 22, storeProcedureDAO.callGetTotalCityStateId());
	}
	
	/**
	 * Test method for {@link com.loiane.dao.StoreProcedureDAO#callTotalCity2()}.
	 */
	@Test
	public void testCallGetStates() {
		
		assertEquals("Call callGetStates", 27, storeProcedureDAO.callGetStates().size());
	}
	
	@Test
	public void testCallTotalCityAnnotations() {
		
		assertEquals("Call callGetTotalCityAnnotations", 5507, storeProcedureDAO.callGetTotalCityAnnotations());
	}
	
	@Test
	public void testCallGetTotalCityStateIdAnnotations() {
		
		assertEquals("Call callGetTotalCityStateIdAnnotations", 22, storeProcedureDAO.callGetTotalCityStateIdAnnotations());
	}
	
	@Test
	public void testCallGetStatesAnnotations() {
		
		assertEquals("Call callGetStatesAnnotations", 27, storeProcedureDAO.callGetStatesAnnotations().size());
	}
}
