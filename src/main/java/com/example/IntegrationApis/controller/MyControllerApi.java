package com.example.IntegrationApis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.IntegrationApis.entites.App;
import com.example.IntegrationApis.entites.Sensor;
import com.example.IntegrationApis.entites.Token;
import com.example.IntegrationApis.entites.UKey;
import com.example.IntegrationApis.services.AppServices;
import com.example.IntegrationApis.services.KeyServices;
import com.example.IntegrationApis.services.SensorService;
import com.example.IntegrationApis.services.TokenService;

@RestController
public class MyControllerApi {

	@Autowired
	private SensorService services;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/sensors")
	public List<Sensor> getSensors()
	{
		return this.services.getSensors();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/sensors/{sensorId}")
	public Sensor getSensor(@PathVariable String sensorId) {
		return this.services.getSensor(Long.parseLong(sensorId));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path="/sensors",consumes="application/json")
	public Sensor addSensor(@RequestBody Sensor sensor)
	{
		return this.services.addSensor(sensor);
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/sensors/{sensorId}")
	public Sensor updateSensor(@RequestBody Sensor sensor)
	{
		return this.services.updateSensor(sensor);
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/sensors/{sensorId}")
	public ResponseEntity<HttpStatus> deleteSensor(@PathVariable String sensorId)
	{
		try {
			this.services.deleteSensor(Long.parseLong(sensorId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@Autowired
	private AppServices service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/app")
	public List<App> getApp()
	{
		return this.service.getApp();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/app/{appId}")
	public App getApp(@PathVariable String appId) {
		return this.service.getApp(Long.parseLong(appId));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path="/app",consumes="application/json")
	public App addApp(@RequestBody App app)
	{
		return this.service.addApp(app);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/app/{appId}")
	public App updateApp(@RequestBody App app)
	{
		return this.service.updateApp(app);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/app/{appId}")
	public ResponseEntity<HttpStatus> deleteApp(@PathVariable String appId)
	{
		try {
			this.service.deleteApp(Long.parseLong(appId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
	
	@Autowired
	private TokenService tokenservice;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/token")
	public List<Token> getToken()
	{
		return this.tokenservice.getToken();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/token/{tokenId}")
	public Token getToken(@PathVariable String tokenId) {
		return this.tokenservice.getToken(Long.parseLong(tokenId));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path="/token",consumes="application/json")
	public Token addToken(@RequestBody Token token)
	{
		return this.tokenservice.addToken(token);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/token/{tokenId}")
	public Token updateSensor(@RequestBody Token token)
	{
		return this.tokenservice.updateToken(token);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/token/{tokenId}")
	public ResponseEntity<HttpStatus> deleteToken(@PathVariable String tokenId)
	{
		try {
			this.tokenservice.deleteToken(Long.parseLong(tokenId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
	
	@Autowired
	private KeyServices keyservice;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/key")
	public List<UKey> getKey()
	{
		return this.keyservice.getKey();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/key/{keyId}")
	public UKey getKey(@PathVariable String keyId) {
		return this.keyservice.getKey(Long.parseLong(keyId));
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path="/key",consumes="application/json")
	public UKey addKey(@RequestBody UKey key)
	{
		return this.keyservice.addKey(key);
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/key/{keyId}")
	public UKey updateKey(@RequestBody UKey key)
	{
		return this.keyservice.updateKey(key);
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/key/{keyId}")
	public ResponseEntity<HttpStatus> deleteKey(@PathVariable String keyId)
	{
		try {
			this.keyservice.deleteKey(Long.parseLong(keyId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
	
}
