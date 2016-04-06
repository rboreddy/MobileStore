package mymobilestore;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTestCase {
	
	
	private HelloWorld helloWorld = new HelloWorld();

	@Test
	public void test() {
		Assert.assertEquals("Hello World Ravi Superrr!", helloWorld.sayHelloWorld());
	}

}
