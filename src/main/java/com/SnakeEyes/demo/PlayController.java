package com.SnakeEyes.demo;

import org.springframework.web.bind.annotation.RestController;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PlayController {

	
	@RequestMapping(path="/play{stake}")
    public ResponseEntity<String> getStake(@RequestParam(value="stake" ) float stake)  throws JSONException {
		
		SnakeEyesGame newGame = new SnakeEyesGame();
		JSONObject msg = newGame.PlayGame(stake);
		
		return new ResponseEntity<String>(msg.toString(), HttpStatus.OK);
		
		
    }
}
