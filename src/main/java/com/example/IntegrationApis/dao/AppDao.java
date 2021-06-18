package com.example.IntegrationApis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IntegrationApis.entites.App;


public interface AppDao extends JpaRepository <App , Long>  {

}
