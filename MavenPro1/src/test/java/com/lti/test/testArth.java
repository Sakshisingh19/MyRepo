package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Hello;

public class testArth {
private Hello arth;
	
	@Before
	public void init() {
		arth = new Hello();
	}
	
	@Test
	public void testSum() {
		assertEquals(10,arth.sum(4,6));
	}

}
