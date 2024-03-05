package com.boargame.api.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface BoardgameController {

	@GetMapping("path")
	public String getRandomGames(@RequestParam String param);
	
}
