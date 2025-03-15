package edu.westga.cs1302.javafx_sample.test.model.StyleAdvantage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.javafx_sample.model.StyleAdvantage;

class testFindStyleAdvantageFighter2 {

	///Wrestler tests
		@Test
		void testFindWrestlerAdvantageWrestlerFighter2() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Wrestling", "Wrestling"));
			
		}
		
		@Test
		void testFindWrestlerAdvantageBJJFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("BJJ", "Wrestling"));
			
		}
		
		@Test
		void testFindWrestlerAdvantageMTFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Muay Thai", "Wrestling"));
			
		}
		
		@Test
		void testFindWrestlerAdvantageKarateFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Karate", "Wrestling"));
			
		}
		
		@Test
		void testFindWrestlerAdvantageKBFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("KickBoxing", "Wrestling"));
			
		}
		
		@Test
		void testFindWrestlerAdvantageBoxingFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Boxing", "Wrestling"));
			
		}
		
		@Test
		void testFindWrestlerAdvantageHybridFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Hybrid", "Wrestling"));
			
		}

		///BBJ
		@Test
		void testFindBBJAdvantageWrestlerFighter2() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("Wrestling", "BJJ"));
			
		}
		
		@Test
		void testFindBJJAdvantageBJJFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("BJJ", "BJJ"));
			
		}
		
		@Test
		void testFindBJJAdvantageMTFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Muay Thai", "BJJ"));
			
		}
		
		@Test
		void testFindBJJAdvantageKarateFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Karate", "BJJ"));
			
		}
		
		@Test
		void testFindBJJAdvantageKBFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("KickBoxing", "BJJ"));
			
		}
		
		@Test
		void testFindBJJAdvantageBoxingFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Boxing", "BJJ"));
			
		}
		
		@Test
		void testFindBJJAdvantageHybridFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Hybrid", "BJJ"));
			
		}
		
		////Muay Thai
		@Test
		void testFindMTAdvantageWrestlerFighter2() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("Wrestling", "Muay Thai"));
			
		}
		
		@Test
		void testFindMTAdvantageBJJFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("BJJ", "Muay Thai"));
			
		}
		
		@Test
		void testFindMTAdvantageMTFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Muay Thai", "Muay Thai"));
			
		}
		
		@Test
		void testFindMTAdvantageKarateFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Karate", "Muay Thai"));
			
		}
		
		@Test
		void testFindMTAdvantageKBFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("KickBoxing", "Muay Thai"));
			
		}
		
		@Test
		void testFindMTAdvantageBoxingFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Boxing", "Muay Thai"));
			
		}
		
		@Test
		void testFindMTAdvantageHybridFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Hybrid", "Muay Thai"));
			
		}
		
		////Karate
		@Test
		void testFindKarateAdvantageWrestlerFighter2() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("Wrestling", "Karate"));
			
		}
		
		@Test
		void testFindKarateAdvantageBJJFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("BJJ", "Karate"));
			
		}
		
		@Test
		void testFindKarateAdvantageMTFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("Muay Thai", "Karate"));
			
		}
		
		@Test
		void testFindKarateAdvantageKarateFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Karate", "Karate"));
			
		}
		
		@Test
		void testFindKarateAdvantageKBFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("KickBoxing", "Karate"));
			
		}
		
		@Test
		void testFindKarateAdvantageBoxingFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Boxing", "Karate"));
			
		}
		
		@Test
		void testFindKarateAdvantageHybridFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Hybrid", "Karate"));
			
		}
		
		///KB
		@Test
		void testFindKBAdvantageWrestlerFighter2() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("Wrestling", "KickBoxing"));
			
		}
		
		@Test
		void testFindKBAdvantageBJJFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("BJJ", "KickBoxing"));
			
		}
		
		@Test
		void testFindKBAdvantageMTFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("Muay Thai", "KickBoxing"));
			
		}
		
		@Test
		void testFindKBAdvantageKarateFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Karate", "KickBoxing"));
			
		}
		
		@Test
		void testFindKBAdvantageKBFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("KickBoxing", "KickBoxing"));
			
		}
		
		@Test
		void testFindKBAdvantageBoxingFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(1, style.findStyleAdvantageFighter2("Boxing", "KickBoxing"));
			
		}
		
		@Test
		void testFindKBAdvantageHybridFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Hybrid", "KickBoxing"));
			
		}
		
		////Boxing
		@Test
		void testFindBoxningAdvantageWrestlerFighter2() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("Wrestling", "Boxing"));
			
		}
		
		@Test
		void testFindBoxingAdvantageBJJFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("BJJ", "Boxing"));
			
		}
		
		@Test
		void testFindBoxingAdvantageMTFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("Muay Thai", "Boxing"));
			
		}
		
		@Test
		void testFindBoxingAdvantageKarateFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("Karate", "Boxing"));
			
		}
		
		@Test
		void testFindBoxingAdvantageKBFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(-1, style.findStyleAdvantageFighter2("KickBoxing", "Boxing"));
			
		}
		
		@Test
		void testFindBoxingAdvantageBoxingFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Boxing", "Boxing"));
			
		}
		
		@Test
		void testFindBoxingAdvantageHybridFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Hybrid", "Boxing"));
			
		}
		
		///Hybrid
		@Test
		void testFindHybridAdvantageWrestlerFighter2() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Wrestling", "Hybrid"));
			
		}
		
		@Test
		void testFindHybridAdvantageBJJFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("BJJ", "Hybrid"));
			
		}
		
		@Test
		void testFindHybridAdvantageMTFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Muay Thai", "Hybrid"));
			
		}
		
		@Test
		void testFindHybridAdvantageKarateFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Karate", "Hybrid"));
			
		}
		
		@Test
		void testFindHybridAdvantageKBFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("KickBoxing", "Hybrid"));
			
		}
		
		@Test
		void testFindHybridAdvantageBoxingFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Boxing", "Hybrid"));
			
		}
		
		@Test
		void testFindHybridAdvantageHybridFighter1() {
			StyleAdvantage style = new StyleAdvantage();
			
			assertEquals(0, style.findStyleAdvantageFighter2("Hybrid", "Hybrid"));
			
		}
}
