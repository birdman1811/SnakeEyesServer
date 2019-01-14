package com.SnakeEyes.demo;

import org.springframework.web.client.RestTemplate;




public class DiceRoller {
	
	public DiceRoller() {
		
	}
	
	 public String GetDiceRolls() {
		 final String url = "https://www.random.org/integers/?num=1&min=1&max=6&col=2&base=10&format=plain";
		 
		 RestTemplate restTemplate = new RestTemplate();
		 String result = restTemplate.getForObject(url, String.class);
		 
		 return result;
	 }

}
