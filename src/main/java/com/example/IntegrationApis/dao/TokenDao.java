package com.example.IntegrationApis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IntegrationApis.entites.Token;


public interface TokenDao extends JpaRepository <Token , Long> {
	

}
