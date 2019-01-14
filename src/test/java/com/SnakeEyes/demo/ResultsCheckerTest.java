package com.SnakeEyes.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsCheckerTest {

	@Test
	public void SnakeEyesPrizeTest() {
		ResultsChecker resultChecker = new ResultsChecker();
		
		float prize = resultChecker.CheckDice(1, 1, 1);
		
		assertTrue(prize == 30);
	}
	
	@Test
	public void DoublesPrizeTest() {
ResultsChecker resultChecker = new ResultsChecker();
		
		float prize = resultChecker.CheckDice(3, 3, 1);
		
		assertTrue(prize == 7);
	}
	
	@Test
	public void NoWinPrizeTest() {
ResultsChecker resultChecker = new ResultsChecker();
		
		float prize = resultChecker.CheckDice(3, 4, 1);
		
		assertTrue(prize == 0);
	}
	
	@Test
	public void SnakeEyesResultTest() {
ResultsChecker resultChecker = new ResultsChecker();
		
		float prize = resultChecker.CheckDice(1, 1, 1);
		String result = resultChecker.GetResult();
		
		assertTrue(result == "Snake Eyes!");
	}

}
