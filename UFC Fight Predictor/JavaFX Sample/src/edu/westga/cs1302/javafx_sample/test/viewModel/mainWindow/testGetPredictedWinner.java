package edu.westga.cs1302.javafx_sample.test.viewModel.mainWindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.javafx_sample.model.Fighter;
import edu.westga.cs1302.javafx_sample.viewModel.mainWindowViewModel;

class testGetPredictedWinner {
	
	@Test
	void testBalancedFight() {
		mainWindowViewModel vm = new mainWindowViewModel();
		Fighter fighter1 = new Fighter("Greg", 28, 71, 56, "KickBoxing", "bantumweight");
		Fighter fighter2 = new Fighter("Israel", 28, 71, 56, "KickBoxing", "bantumweight");
		
		assertEquals("Both fighters have an equal chance of winning the fight (50% each)", vm.getPredictedWinner(fighter1, fighter2));
	}
	
	@Test
	void testFighter1Wins() {
		mainWindowViewModel vm = new mainWindowViewModel();
		Fighter fighter1 = new Fighter("Greg", 35, 72, 76, "Wrestling", "bantumweight");
		Fighter fighter2 = new Fighter("Israel", 28, 71, 72, "KickBoxing", "bantumweight");
		
		assertEquals("Greg has a predicted probability to win by 92%", vm.getPredictedWinner(fighter1, fighter2));
	}
	
	@Test
	void testFighter2Wins() {
		mainWindowViewModel vm = new mainWindowViewModel();
		Fighter fighter1 = new Fighter("Israel", 32, 72, 76, "KickBoxing", "Middleweight");
		Fighter fighter2 = new Fighter("Greg", 38, 73, 78, "Muay Thai", "Middleweight");
		
		assertEquals("Greg has a predicted probability to win by 79%", vm.getPredictedWinner(fighter1, fighter2));
	}
	
	@Test
	void testWeirdHieghtFighter2Wins() {
		mainWindowViewModel vm = new mainWindowViewModel();
		Fighter fighter1 = new Fighter("Israel", 32, 70, 72, "Boxing", "Middleweight");
		Fighter fighter2 = new Fighter("Greg", 28, 68, 73, "KickBoxing", "Middleweight");
		
		assertEquals("Greg has a predicted probability to win by 76%", vm.getPredictedWinner(fighter1, fighter2));
	}
}
