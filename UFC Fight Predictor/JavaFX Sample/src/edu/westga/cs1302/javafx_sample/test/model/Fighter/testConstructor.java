package edu.westga.cs1302.javafx_sample.test.model.Fighter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.javafx_sample.model.Fighter;

public class testConstructor {

	@Test
	void testNullName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Fighter(null, 20, 73, 13.1, "BJJ", "Bantumweight");
		});
	}
	
	@Test
	void testEmptyName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Fighter("", 20, 73, 13.1, "BJJ", "Bantumweight");
		});
	}

	@Test
	void testBlankName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Fighter(" ", 20, 73, 13.1, "BJJ", "Bantumweight");
		});
	}
	
	@Test
	void testAgeLessThanOne() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Fighter("Jeff", 0, 73, 13.1, "BJJ", "Bantumweight");
		});
	}
	
	@Test
	void testHeightLessThanOne() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Fighter("Jeff", 24, 0, 13.1, "BJJ", "Bantumweight");
		});
	}
	
	@Test
	void testReachLessThanOne() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Fighter("Jeff", 24, 73, 0.3, "BJJ", "Bantumweight");
		});
	}
	

	@Test
	void testValidConstructor() {
		Fighter fighter = new Fighter("Jeff", 23, 75, 27.6, "Boxing", "Lightweight");

		assertEquals(fighter.getName(), "Jeff");
		assertEquals(fighter.getAge(), 23);
		assertTrue(fighter.getHeight() == 75);
		assertTrue(fighter.getReach() == 27.6);
		assertEquals(fighter.getStyle(), "Boxing");
		assertEquals(fighter.getWeightClass(), "Lightweight");
		
	}
}
