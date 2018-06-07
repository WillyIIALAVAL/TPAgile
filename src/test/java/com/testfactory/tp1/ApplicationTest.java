package com.testfactory.tp1;

import org.junit.Assert;
import org.junit.Test;


public class ApplicationTest {
	
	@Test
	public static void testAdd() {
		int i = 2, j = 3;
		
		int k = Application.add(i , j);
			
	    Assert.assertEquals("Add not good !", k , 5);
	}

}
