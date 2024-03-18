package com.boargame.api.controller.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boargame.api.controller.BoardgameController;
import com.boargame.api.model.soap.response.BoardGames;
import com.boargame.api.service.BoardGameService;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

@RestController
public class BoardgameControllerImpl implements BoardgameController {

	@Autowired
	BoardGameService boardGameService;

	@Override
	public String getRandomGames() {
		String responseService = boardGameService.getRandomGames();
		return responseService;
	}

	@Override
	public BoardGames findGameByName(@RequestParam String name) {

		BoardGames boardgames = new BoardGames();
		try {
			File file = new File("src\\main\\resources\\searchByNameShowOneResult.xml");

			XmlMapper xmlMapper = new XmlMapper();

			boardgames = xmlMapper.readValue(file, BoardGames.class);

		} catch (Exception e) {
			// TODO: handle exception
		}

		return boardgames;
	}

}
