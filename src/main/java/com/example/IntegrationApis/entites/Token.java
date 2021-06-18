package com.example.IntegrationApis.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Token {
	
	@Id
	private long id;
	private String user_id;
	private long is_logged_in;
	private String device_id;
	private String device_token;
	private String created_at;
	private String updated_at;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public long getIs_logged_in() {
		return is_logged_in;
	}
	public void setIs_logged_in(int is_logged_in) {
		this.is_logged_in = is_logged_in;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public String getDevice_token() {
		return device_token;
	}
	public void setDevice_token(String device_token) {
		this.device_token = device_token;
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
		return "Token [id=" + id + ", user_id=" + user_id + ", is_logged_in=" + is_logged_in + ", device_id="
				+ device_id + ", device_token=" + device_token + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}
	public Token(int id, String user_id, int is_logged_in, String device_id, String device_token, String created_at,
			String updated_at) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.is_logged_in = is_logged_in;
		this.device_id = device_id;
		this.device_token = device_token;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public Token() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
