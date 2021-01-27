package wt.maven;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void testHello() {
		HelloWorld hello = new HelloWorld();
		String result = hello.sayHello("zs");
		assertEquals("Hello zs",result);//╤оят
	}
}
