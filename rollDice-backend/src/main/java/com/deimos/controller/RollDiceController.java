package com.deimos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deimos.service.RollDiceService;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/v1/roll")
@RestController
@CrossOrigin("*")
public class RollDiceController {
	
	@Autowired
	private RollDiceService diceService;
	
	@GetMapping
	public ResponseEntity<Integer> rollDice(@RequestParam Integer diceFaces) {
		
		return diceService.filterDice(diceFaces);
	}
}