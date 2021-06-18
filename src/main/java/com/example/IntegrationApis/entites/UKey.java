package com.example.IntegrationApis.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class UKey {
	
	@Id
	private long id;
	private long uid;
	private String usercode;
	private String apikeys;
	private String secretkeys;
	private String createdat;
	private String updatedat;
	public UKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UKey(long id, long uid, String usercode, String apikeys, String secretkeys, String createdat,
			String updatedat) {
		super();
		this.id = id;
		this.uid = uid;
		this.usercode = usercode;
		this.apikeys = apikeys;
		this.secretkeys = secretkeys;
		this.createdat = createdat;
		this.updatedat = updatedat;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getApikeys() {
		return apikeys;
	}
	public void setApikeys(String apikeys) {
		this.apikeys = apikeys;
	}
	public String getSecretkeys() {
		return secretkeys;
	}
	public void setSecretkeys(String secretkeys) {
		this.secretkeys = secretkeys;
	}
	public String getCreatedat() {
		return createdat;
	}
	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}
	public String getUpdatedat() {
		return updatedat;
	}
	public void setUpdatedat(String updatedat) {
		this.updatedat = updatedat;
	}
	@Override
	public String toString() {
		return "Key [id=" + id + ", uid=" + uid + ", usercode=" + usercode + ", apikeys=" + apikeys + ", secretkeys="
				+ secretkeys + ", createdat=" + createdat + ", updatedat=" + updatedat + "]";
	}
	
	
	

}
