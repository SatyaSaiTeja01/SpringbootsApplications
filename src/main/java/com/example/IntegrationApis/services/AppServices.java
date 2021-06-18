package com.example.IntegrationApis.services;

import java.util.List;

import com.example.IntegrationApis.entites.App;


public interface AppServices {
public List<App> getApp();
	
	public App getApp(long appId);
	
	public App addApp(App app);

	public App updateApp(App app);
	
	public void deleteApp(long appId);

}
