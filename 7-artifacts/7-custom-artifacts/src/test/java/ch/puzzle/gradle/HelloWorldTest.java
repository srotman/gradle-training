package ch.puzzle.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testGreeting() {
		assertEquals("Hello, World!", HelloWorld.getGreeting());
	}
	
}
