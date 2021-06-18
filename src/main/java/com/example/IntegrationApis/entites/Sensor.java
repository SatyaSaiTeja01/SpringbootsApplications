package com.example.IntegrationApis.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sensor {

	@Id
	private long id;
	private String sensor_name;
	private String sensor_code;
	private long status;
	public Sensor(long id, String sensor_name, String sensor_code, long status, String created_at, String updated_at) {
		super();
		this.id = id;
		this.sensor_name = sensor_name;
		this.sensor_code = sensor_code;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	private String created_at;
	private String updated_at;
	public Sensor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSensor_name() {
		return sensor_name;
	}
	public void setSensor_name(String sensor_name) {
		this.sensor_name = sensor_name;
	}
	public String getSensor_code() {
		return sensor_code;
	}
	public void setSensor_code(String sensor_code) {
		this.sensor_code = sensor_code;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "Sensor [id=" + id + ", sensor_name=" + sensor_name + ", sensor_code=" + sensor_code + ", status="
				+ status + ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
}
