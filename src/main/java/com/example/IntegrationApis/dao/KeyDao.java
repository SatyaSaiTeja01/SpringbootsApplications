package com.example.IntegrationApis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IntegrationApis.entites.UKey;


public interface KeyDao extends JpaRepository <UKey , Long> {

}
