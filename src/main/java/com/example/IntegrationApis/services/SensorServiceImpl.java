package com.example.IntegrationApis.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IntegrationApis.dao.SensorDao;
import com.example.IntegrationApis.entites.Sensor;

@Service
public class SensorServiceImpl implements SensorService{
	@Autowired
	private SensorDao sensordao;
//	List<Sensor> list;
	
	public SensorServiceImpl()
	{
//		list=new ArrayList<>();
//		list.add(new Sensor(1,"Temperature","AXEFGIE",1,"17-05-2021","19-05-2021"));
//		list.add(new Sensor(2,"Humidity","BYDICBDE",0,"18-05-2021","1-05-2021"));
	}

	@Override
	public List<Sensor> getSensors() {
		
		return sensordao.findAll();
	}

	@Override
	public Sensor getSensor(long sensorId) {
		
		Sensor s=null;
		for(Sensor sensor:sensordao.findAll())
	{
			if(sensor.getId()==sensorId)
			{
				s=sensor;
				break;
			}
		}
		//return sensordao.getOne(sensorId);
		
		return s;
		
	}

	@Override
	public Sensor addSensor(Sensor sensor) {
		// TODO Auto-generated method stub
//		list.add(sensor);
		sensordao.save(sensor);
		return sensor;
	}

	@Override
	public Sensor updateSensor(Sensor sensor) {
		
//		list.forEach(e->{
//			if(e.getId()==sensor.getId())
//			{
//				e.setSensor_name(sensor.getSensor_name());
//				e.setSensor_code(sensor.getSensor_code());
//				e.setStatus(sensor.getStatus());
//				e.setCreated_at(sensor.getCreated_at());
//				e.setUpdated_at(sensor.getUpdated_at());
//				
//			}
//		});
		sensordao.save(sensor);
		return sensor;
	}

	@Override
	public void deleteSensor(long sensorId) {
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getId()!= sensorId).collect(Collectors.toList());
		Sensor entity=sensordao.getOne(sensorId);
		sensordao.delete(entity);
	}


}
