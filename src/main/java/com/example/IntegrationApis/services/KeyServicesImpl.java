package com.example.IntegrationApis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IntegrationApis.dao.KeyDao;
import com.example.IntegrationApis.entites.UKey;

@Service
public class KeyServicesImpl implements KeyServices{
	
	@Autowired
	private KeyDao keydao;

	@Override
	public List<UKey> getKey() {
		// TODO Auto-generated method stub
		return keydao.findAll();
	}

	@Override
	public UKey getKey(long keyId) {
		// TODO Auto-generated method stub
		return keydao.getOne(keyId);
	}

	@Override
	public UKey addKey(UKey key) {
		// TODO Auto-generated method stub
		keydao.save(key);
		return key;
	}

	@Override
	public UKey updateKey(UKey key) {
		// TODO Auto-generated method stub
		keydao.save(key);
		return key;
	}

	@Override
	public void deleteKey(long keyId) {
		// TODO Auto-generated method stub
		UKey entity=keydao.getOne(keyId);
		keydao.delete(entity);
		
	}

}
