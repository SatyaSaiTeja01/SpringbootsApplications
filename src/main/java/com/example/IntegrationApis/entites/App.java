package com.example.IntegrationApis.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class App {
	
	@Id
	private long id;
	private String Name;
	private String code;
	private long status;
	private long wattage;
	private String on_icon;
	private String off_icon;
	private String created_at;
	private String updated_at;
	public App() {
		super();
		// TODO Auto-generated constructor stub
	}
	public App(long id, String name, String code, long status, long wattage, String on_icon, String off_icon,
			String created_at, String updated_at) {
		super();
		this.id = id;
		Name = name;
		this.code = code;
		this.status = status;
		this.wattage = wattage;
		this.on_icon = on_icon;
		this.off_icon = off_icon;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public long getWattage() {
		return wattage;
	}
	public void setWattage(long wattage) {
		this.wattage = wattage;
	}
	public String getOn_icon() {
		return on_icon;
	}
	public void setOn_icon(String on_icon) {
		this.on_icon = on_icon;
	}
	public String getOff_icon() {
		return off_icon;
	}
	public void setOff_icon(String off_icon) {
		this.off_icon = off_icon;
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
		return "App [id=" + id + ", Name=" + Name + ", code=" + code + ", status=" + status + ", wattage=" + wattage
				+ ", on_icon=" + on_icon + ", off_icon=" + off_icon + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}
	
	

}
