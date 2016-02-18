package com.webservices.modal;

// Generated Feb 15, 2016 12:31:18 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MyServiceId generated by hbm2java
 */
@Embeddable
public class DailyServiceId implements java.io.Serializable {

	private long serviceId;
	private String itemDesc;
	
	private Integer type;
	private Integer userId;	
	private Date createDate;
	private String active;
	private Float price;

	public DailyServiceId() {
	}

	public DailyServiceId(long serviceId, Date createDate, String active) {
		this.serviceId = serviceId;
		this.createDate = createDate;
		this.active = active;
	}

	
	@Column(name = "serviceID", nullable = false)
	public long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}
	@Column(name = "field1")
	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	@Column(name = "intfield1")
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	@Column(name = "intfield2")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", nullable = false, length = 19)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	// @JsonProperty("bill-amount")
	@Column(name = "active", nullable = false, length = 1)
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
  
	@Column(name = "floatfield1", precision = 12, scale = 0)
	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	

}
