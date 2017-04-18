package com.hello;

import org.junit.*;


public class HelloMavenTest {

	@Test
	public void testHello(){
		Assert.assertEquals("hello maven", new HelloMaven().sayHello());
	}

}
