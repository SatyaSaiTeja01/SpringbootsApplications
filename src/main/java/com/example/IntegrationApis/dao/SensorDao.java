package com.example.IntegrationApis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IntegrationApis.entites.Sensor;

public interface SensorDao extends JpaRepository <Sensor , Long> {
	

}
