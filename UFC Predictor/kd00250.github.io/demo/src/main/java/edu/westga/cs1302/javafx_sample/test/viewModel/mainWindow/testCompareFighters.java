package edu.westga.cs1302.javafx_sample.test.viewModel.mainWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.javafx_sample.model.Fighter;
import edu.westga.cs1302.javafx_sample.viewModel.mainWindowViewModel;

public class testCompareFighters {

	@Test
	void testBalancedFight() {
		mainWindowViewModel vm = new mainWindowViewModel();
		Fighter fighter1 = new Fighter("Greg", 28, 71, 56, "KickBoxing", "bantumweight");
		Fighter fighter2 = new Fighter("Israel", 28, 71, 56, "KickBoxing", "bantumweight");
		
		assertEquals("Both fighters have an equal chance of winning the fight (50% each)", vm.getPredictedWinner(fighter1, fighter2));
	}
}
