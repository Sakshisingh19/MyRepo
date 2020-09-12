package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Arth;

public class testArth {
private Arth ar;
	
	@Before
	public void init() {
		ar = new Arth();
	}
	
	@Test
	public void testSum() {
		assertEquals(10,ar.sum(4,6));
	}
	

}
