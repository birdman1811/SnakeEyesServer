package com.SnakeEyes.demo;

public class ResultsChecker {
	float prize;
	String result;
	
	public float CheckDice(int dice1, int dice2, float stake) {
	int diceTotal = dice1 + dice2;
	
	//If we have Snake Eyes the total will always be 2, and since the only way the total
	//can be 2 is via Snake eyes, we use that to test for Snake Eyes, rather than a more complex
	//comparison statement.
	if (diceTotal == 2) {
		prize = stake * 30;
		result = "Snake Eyes!";
	}
	
	else {
		if (dice1 == dice2) {
			prize = stake * 7;
			result = "Doubles!";
		}
		
		else {
			prize = 0;
			result = "No win";
		}
	}
	
	return prize;
	}
	
	public String GetResult() {
		return result;
	}
}