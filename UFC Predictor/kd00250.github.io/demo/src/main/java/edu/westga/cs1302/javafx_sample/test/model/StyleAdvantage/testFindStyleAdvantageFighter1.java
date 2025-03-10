package edu.westga.cs1302.javafx_sample.test.model.StyleAdvantage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.javafx_sample.model.StyleAdvantage;

class testFindStyleAdvantageFighter1 {

	///Wrestler tests
	@Test
	void testFindWrestlerAdvantageWrestlerFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Wrestling", "Wrestling"));
		
	}
	
	@Test
	void testFindWrestlerAdvantageBJJFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Wrestling", "BJJ"));
		
	}
	
	@Test
	void testFindWrestlerAdvantageMTFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("Wrestling", "Muay Thai"));
		
	}
	
	@Test
	void testFindWrestlerAdvantageKarateFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("Wrestling", "Karate"));
		
	}
	
	@Test
	void testFindWrestlerAdvantageKBFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("Wrestling", "KickBoxing"));
		
	}
	
	@Test
	void testFindWrestlerAdvantageBoxingFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("Wrestling", "Boxing"));
		
	}
	
	@Test
	void testFindWrestlerAdvantageHybridFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Wrestling", "Hybrid"));
		
	}
	/////BJJ tests
	
	@Test
	void testFindBJJAdvantageWrestlerFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("BJJ", "Wrestling"));
		
	}
	
	@Test
	void testFindBJJAdvantageBJJFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("BJJ", "BJJ"));
		
	}
	
	@Test
	void testFindBJJAdvantageMTFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("BJJ", "Muay Thai"));
		
	}
	
	@Test
	void testFindBJJAdvantageKarateFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("BJJ", "Karate"));
		
	}
	
	@Test
	void testFindBJJAdvantageKBFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("BJJ", "KickBoxing"));
		
	}
	
	@Test
	void testFindBJJAdvantageBoxingFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("BJJ", "Boxing"));
		
	}
	
	@Test
	void testFindBJJAdvantageHybridFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("BJJ", "Hybrid"));
		
	}
	////Muay Thai tests
	
	@Test
	void testFindMTAdvantageWrestlerFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Muay Thai", "Wrestling"));
		
	}
	
	@Test
	void testFindMTAdvantageBJJFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Muay Thai", "BJJ"));
		
	}
	
	@Test
	void testFindMTAdvantageMTFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Muay Thai", "Muay Thai"));
		
	}
	
	@Test
	void testFindMTAdvantageKarateFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("Muay Thai", "Karate"));
		
	}
	
	@Test
	void testFindMTAdvantageKBFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("Muay Thai", "KickBoxing"));
		
	}
	
	@Test
	void testFindMTAdvantageBoxingFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("Muay Thai", "Boxing"));
		
	}
	
	@Test
	void testFindMTAdvantageHybridFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Muay Thai", "Hybrid"));
		
	}
	///Karate
	
	@Test
	void testFindKarateAdvantageWrestlerFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Karate", "Wrestling"));
		
	}
	
	@Test
	void testFindKarateAdvantageBJJFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Karate", "BJJ"));
		
	}
	
	@Test
	void testFindKarateAdvantageMTFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Karate", "Muay Thai"));
		
	}
	
	@Test
	void testFindKarateAdvantageKarateFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Karate", "Karate"));
		
	}
	
	@Test
	void testFindKarateAdvantageKBFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Karate", "KickBoxing"));
		
	}
	
	@Test
	void testFindKarateAdvantageBoxingFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("Karate", "Boxing"));
		
	}
	
	@Test
	void testFindKarateAdvantageHybridFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Karate", "Hybrid"));
		
	}
	
	///KickBoxing
	
	@Test
	void testFindKBAdvantageWrestlerFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("KickBoxing", "Wrestling"));
		
	}
	
	@Test
	void testFindKBAdvantageBJJFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("KickBoxing", "BJJ"));
		
	}
	
	@Test
	void testFindKBAdvantageMTFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("KickBoxing", "Muay Thai"));
		
	}
	
	@Test
	void testFindKBAdvantageKarateFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("KickBoxing", "Karate"));
		
	}
	
	@Test
	void testFindKBAdvantageKBFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("KickBoxing", "KickBoxing"));
		
	}
	
	@Test
	void testFindKBAdvantageBoxingFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(1, style.findStyleAdvantageFighter1("KickBoxing", "Boxing"));
		
	}
	
	@Test
	void testFindKBAdvantageHybridFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("KickBoxing", "Hybrid"));
		
	}
	
	////Boxing Test
	@Test
	void testFindBoxingAdvantageWrestlerFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Boxing", "Wrestling"));
		
	}
	
	@Test
	void testFindBoxingAdvantageBJJFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Boxing", "BJJ"));
		
	}
	
	@Test
	void testFindBoxingAdvantageMTFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Boxing", "Muay Thai"));
		
	}
	
	@Test
	void testFindBoxingAdvantageKarateFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Boxing", "Karate"));
		
	}
	
	@Test
	void testFindBoxingAdvantageKBFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(-1, style.findStyleAdvantageFighter1("Boxing", "KickBoxing"));
		
	}
	
	@Test
	void testFindBoxingAdvantageBoxingFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Boxing", "Boxing"));
		
	}
	
	@Test
	void testFindBoxingAdvantageHybridFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Boxing", "Hybrid"));
		
	}
	////Hybrid
	
	@Test
	void testFindHybridAdvantageWrestlerFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Hybrid", "Wrestling"));
		
	}
	
	@Test
	void testFindHybridAdvantageBJJFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Hybrid", "BJJ"));
		
	}
	
	@Test
	void testFindHybridAdvantageMTFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Hybrid", "Muay Thai"));
		
	}
	
	@Test
	void testFindHybridAdvantageKarateFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Hybrid", "Karate"));
		
	}
	
	@Test
	void testFindHybridAdvantageKBFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Hybrid", "KickBoxing"));
		
	}
	
	@Test
	void testFindHybridAdvantageBoxingFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Hybrid", "Boxing"));
		
	}
	
	@Test
	void testFindHybridAdvantageHybridFighter1() {
		StyleAdvantage style = new StyleAdvantage();
		
		assertEquals(0, style.findStyleAdvantageFighter1("Hybrid", "Hybrid"));
		
	}
	

}
