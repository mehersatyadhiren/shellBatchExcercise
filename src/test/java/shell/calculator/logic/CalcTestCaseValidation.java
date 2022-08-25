package shell.calculator.logic;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;

import org.junit.Test;

import junit.framework.Assert;

public class CalcTestCaseValidation {

	CalcSample calc;
	
	//
	@Before
	public void thisIsBeforeAnnotation() {
		calc=new CalcSample();
	}
	
	@Test
	public void test() {
		int expectedResult=30;
		int actualResult=calc.addition(10,20);
		Assert.assertEquals(expectedResult, actualResult);
	}

	@Test
	public void validateSubtraction()
	{
		int expectedResult=5;
		int actualResult=calc.subtraction(10,5);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@After
	public void tearDown()
	{
		System.out.println("TestCase is completed");
	}
	
}
