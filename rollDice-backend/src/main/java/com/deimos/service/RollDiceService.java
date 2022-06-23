package com.deimos.service;

import org.springframework.http.ResponseEntity;

public interface RollDiceService {
	
	public ResponseEntity<Integer> filterDice(Integer diceFaces);
	public Integer rollDice(Integer diceFaces);
}