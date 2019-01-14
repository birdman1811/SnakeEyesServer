package com.SnakeEyes.demo;

import org.json.JSONException;
import org.json.JSONObject;

public class SnakeEyesGame {

	private int dice1;
	private int dice2;
	private float stake;
	private float prize;
	private String result;
	
	public SnakeEyesGame() {	
		
	}
	
	//Play Game Method, this starts the game, takes in the players Stake as an argument.
	public JSONObject PlayGame(float stake) throws JSONException {
		this.stake = stake;
		DiceRoller diceRoller = new DiceRoller();
		String diceRoll1 = diceRoller.GetDiceRolls();
		String diceRoll2 = diceRoller.GetDiceRolls();
		
		char number1 = diceRoll1.charAt(0);
		char number2 = diceRoll2.charAt(0);
		
		dice1 = Character.getNumericValue(number1);
		dice2 = Character.getNumericValue(number2);
		
		CheckResults();
		JSONObject results = CreateJsonObject();
		
		return results;
		
	}
	
	private void CheckResults() {
		ResultsChecker resultChecker = new ResultsChecker();
		
		prize = resultChecker.CheckDice(dice1, dice2, stake);
		result = resultChecker.GetResult();
		
	}
	
	private JSONObject CreateJsonObject() throws JSONException {
		JSONObject results = new JSONObject();
		
		results.put("dice1", dice1);		
		results.put("dice2", dice2);
		results.put("stake", stake);
		results.put("winnings", prize);
		results.put("payout_name", result);
		
		
		return results;
	}
	
	
	
}
