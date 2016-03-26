package com.webservices.modal;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the user_service_mapping database table.
 * 
 */
@Embeddable
public class UserServiceMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="role_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int roleId;

	@Column(name="service_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int serviceId;

	@Column(name="user_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int userId;

	public UserServiceMappingPK() {
	}
	public int getRoleId() {
		return this.roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserServiceMappingPK)) {
			return false;
		}
		UserServiceMappingPK castOther = (UserServiceMappingPK)other;
		return 
			(this.roleId == castOther.roleId)
			&& (this.serviceId == castOther.serviceId)
			&& (this.userId == castOther.userId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.roleId;
		hash = hash * prime + this.serviceId;
		hash = hash * prime + this.userId;
		
		return hash;
	}
}