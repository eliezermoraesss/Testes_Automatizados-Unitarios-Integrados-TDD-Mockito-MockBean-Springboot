package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		// arrange
		
		// action
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// assert
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		// arrange
		
		// action
			
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// action
		f.setTotalAmount(90000.0);
		
		// assert
		Assertions.assertEquals(90000, f.getTotalAmount());		
		
	}
	
	@Test
	public void setTotalAmountShoulThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);
		});	
	}
	
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// action
		f.setIncome(2100.0);
		
		// assert
		Assertions.assertEquals(2100, f.getIncome());		
		
	}
	
	@Test
	public void setIncomeShoulThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1000.0);
		});	
	}
	
	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// action
		f.setMonths(81);
		
		// assert
		Assertions.assertEquals(81, f.getMonths());		
		
	}
	
	@Test
	public void setMonthsShoulThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(79);
		});	
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		
		// action
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// assert 
		Assertions.assertEquals(20000, f.entry());
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		
		// action
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// assert
		Assertions.assertEquals(1000, f.quota());
	}
}
