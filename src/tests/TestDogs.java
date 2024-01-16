package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Dogs;

/**
 * @author Mike Cordon - mrcordon@dmacc.edu
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class TestDogs {
	Dogs dog = new Dogs();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGoodBoy() {
		dog.setGoodBoy(true);
		assertTrue(dog.isGoodBoy());
	}

	@Test
	public void testFoodXLargeDog() {
		dog.setWeight(110);
		assertEquals(6.0, dog.howMuchFood(), 0.0);
	}
	
	@Test
	public void testFoodLargeDog() {
		dog.setWeight(75);
		assertEquals(4.0, dog.howMuchFood(), 0.0);
	}
	
	@Test
	public void testFoodMediumDog() {
		dog.setWeight(30);
		assertEquals(2.0, dog.howMuchFood(), 0.0);
	}
	
	@Test
	public void testFoodSmallDog() {
		dog.setWeight(15);
		assertEquals(1.0, dog.howMuchFood(), 0.0);
	}
}
