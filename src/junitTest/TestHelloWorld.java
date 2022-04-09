package junitTest;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestHelloWorld {
	@Test
	public void testSay() {
		HelloWorld hi=new HelloWorld();
		assertEquals("Hello World!", hi.say());
	}
}
