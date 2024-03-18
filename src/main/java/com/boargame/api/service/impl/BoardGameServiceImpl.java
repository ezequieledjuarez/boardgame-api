package com.boargame.api.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.boargame.api.model.soap.response.BoardGames;
import com.boargame.api.service.BoardGameService;
import com.google.common.net.HttpHeaders;
import com.google.common.net.MediaType;

@Service
public class BoardGameServiceImpl implements BoardGameService {

	private static  String URL_BASE= "https://api.geekdo.com/xmlapi";  
	
	@Override
	public String getRandomGames() {
		WebClient client = WebClient.builder()
				.baseUrl(URL_BASE.concat("/boardgame/2356"))
			    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.XML_UTF_8.toString())
			    .build();
		
		String response = client.get()
				.uri(URL_BASE.concat("/2356"))
				.header(HttpHeaders.CONTENT_TYPE, MediaType.XML_UTF_8.toString())
				.retrieve()
				.bodyToMono(String.class)
				.block();
		
		return response;
	}

	@Override
	public BoardGames findByName(String name) {
		WebClient client = WebClient.builder()
				.baseUrl(URL_BASE)
			    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.XML_UTF_8.toString())
			    .build();
		
		BoardGames response = client.get()
				.uri(URL_BASE.concat("/search?search=".concat(name).concat("&exact=1")))
				.header(HttpHeaders.CONTENT_TYPE, MediaType.XML_UTF_8.toString())
				.retrieve()
				.bodyToMono(BoardGames.class)
				.block();
		
		return response;
	}

}
