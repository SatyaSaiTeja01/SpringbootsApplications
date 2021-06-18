package com.example.IntegrationApis.services;

import java.util.List;

import com.example.IntegrationApis.entites.UKey;

public interface KeyServices {
public List<UKey> getKey();
	
	public UKey getKey(long keyId);
	
	public UKey addKey(UKey key);

	public UKey updateKey(UKey key);
	
	public void deleteKey(long keyId);

}
