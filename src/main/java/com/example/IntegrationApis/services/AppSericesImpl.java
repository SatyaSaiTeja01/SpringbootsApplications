package com.example.IntegrationApis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IntegrationApis.dao.AppDao;
import com.example.IntegrationApis.entites.App;


@Service
public class AppSericesImpl implements AppServices{

	@Autowired
	private AppDao appdao;

	@Override
	public List<App> getApp() {
		return appdao.findAll();
	}

	@Override
	public App getApp(long appId) {
		return appdao.getOne(appId);
	}

	@Override
	public App addApp(App app) {
		// TODO Auto-generated method stub
		appdao.save(app);
		return app;
	}

	@Override
	public App updateApp(App app) {
		// TODO Auto-generated method stub
		appdao.save(app);
		return app;
	}

	@Override
	public void deleteApp(long appId) {
		// TODO Auto-generated method stub
		App entity=appdao.getOne(appId);
		appdao.delete(entity);
		
	}
	
	

}
