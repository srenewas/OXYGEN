package com.suvvy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class junit {
	@Test
    public void junit(){
	   test test = new test();
	   int result = test.add(100,300);
	   assertEquals(400, result);
   }
}
