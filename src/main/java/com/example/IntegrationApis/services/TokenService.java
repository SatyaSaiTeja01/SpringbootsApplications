package com.example.IntegrationApis.services;

import java.util.List;

import com.example.IntegrationApis.entites.Token;


public interface TokenService {
public List<Token> getToken();
	
	public Token getToken(long tokenId);
	
	public Token addToken(Token token);

	public Token updateToken(Token token);
	
	public void deleteToken(long tokenId);

}
