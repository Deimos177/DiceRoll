package com.deimos.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.deimos.service.RollDiceService;

@Service
public class RollDiceServiceImpl implements RollDiceService {

	Integer diceValue;
	Random random = new Random();
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public ResponseEntity<Integer> filterDice(Integer diceFaces) {

		diceValue = (diceFaces != 0) ? rollDice(diceFaces): 0  ;

		if (diceValue == 0 || diceFaces == 0) {
			logger.error("face do dado não existente!!!");
			return ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(diceValue);
	}

	@Override
	public Integer rollDice(Integer diceFaces) {

		List<Integer> faces = Arrays.asList(4, 6, 8, 10, 12, 20);
		Integer dice = 0;

		if (faces.contains(diceFaces)) {
			dice = random.nextInt(diceFaces + 1);
			if (dice == 0)
				dice += 1;
		}

		return dice;
	}
}