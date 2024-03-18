package com.boargame.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boargame.api.model.soap.response.BoardGames;

@RestController
public interface BoardgameController {

	@GetMapping("/games")
	public String getRandomGames();
	
	@GetMapping("/games/search")
	public BoardGames findGameByName(@RequestParam String name);
}
