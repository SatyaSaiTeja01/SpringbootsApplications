package com.example.IntegrationApis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IntegrationApis.dao.TokenDao;
import com.example.IntegrationApis.entites.Token;

@Service
public class TokenServiceImpl implements TokenService{

	@Autowired
	private TokenDao tokendao;
	
	@Override
	public List<Token> getToken() {
		// TODO Auto-generated method stub
		return tokendao.findAll();
	}

	@Override
	public Token getToken(long tokenId) {
		return tokendao.getOne(tokenId);
	}

	@Override
	public Token addToken(Token token) {
		tokendao.save(token);
		return token;
	}

	@Override
	public Token updateToken(Token token) {
		// TODO Auto-generated method stub
		tokendao.save(token);
		return token;
	}

	@Override
	public void deleteToken(long tokenId) {
		Token entity=tokendao.getOne(tokenId);
		tokendao.delete(entity);
		
	}
	

}
