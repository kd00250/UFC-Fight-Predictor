package edu.westga.cs1302.javafx_sample.test.viewModel.mainWindow;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.javafx_sample.viewModel.mainWindowViewModel;

class testConvertToInches {

	@Test
	void testTooManyInches() {
		mainWindowViewModel vm = new mainWindowViewModel();
		
		assertThrows(IllegalArgumentException.class, () -> {
			vm.convertToInches("5,13");
		});
	}
	
	@Test
	void testConvertInches1() {
		mainWindowViewModel vm = new mainWindowViewModel();
		
		assertEquals(vm.convertToInches("5,10"), 70);
	}
	
	@Test
	void testConvertInches2() {
		mainWindowViewModel vm = new mainWindowViewModel();
		
		assertEquals(vm.convertToInches("5,03"), 63);
	}

}
