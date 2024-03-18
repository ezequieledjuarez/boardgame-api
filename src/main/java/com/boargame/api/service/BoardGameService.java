package com.boargame.api.service;

import org.springframework.stereotype.Service;

import com.boargame.api.model.soap.response.BoardGames;

@Service
public interface BoardGameService {

	public String getRandomGames();

	public BoardGames findByName(String name);
}
