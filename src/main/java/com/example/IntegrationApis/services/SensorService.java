package com.example.IntegrationApis.services;

import java.util.List;

import com.example.IntegrationApis.entites.Sensor;

public interface SensorService {
	
	public List<Sensor> getSensors();
	
	public Sensor getSensor(long sensorId);
	
	public Sensor addSensor(Sensor sensor);

	public Sensor updateSensor(Sensor sensor);
	
	public void deleteSensor(long sensorId);
}
