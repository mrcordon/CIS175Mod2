package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Cats;

/**
 * @author Mike Cordon - mrcordon@dmacc.edu
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class TestCats {
	Cats cat = new Cats();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testColor() {
		cat.setColor("Calico");
		assertEquals("Calico", cat.getColor());
	}
	public void testName() {
		cat.setName("Tabitha");
		assertEquals("Tabitha", cat.getName());
	}
	
	@Test
	public void testNameIsNull() {
		assertNull(cat.getName());
	}

}
