package com.webservices.modal;

// Generated Feb 12, 2016 3:01:14 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * UserAccesstoken generated by hbm2java
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@jacksonVersion")
@Entity

@Table(name = "user_accesstoken", catalog = "mysql_service", uniqueConstraints = @UniqueConstraint(columnNames = "token"))
public class UserAccesstoken implements java.io.Serializable {

	private Integer tokenId;

	private Users users;
	private Date createDate;
	private String token;
	private Date validUntil;

	public UserAccesstoken() {
	}

	public UserAccesstoken(Users users, Date createDate, String token,
			Date validUntil) {
		this.users = users;
		this.createDate = createDate;
		this.token = token;
		this.validUntil = validUntil;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "tokenID", unique = true, nullable = false)
	public Integer getTokenId() {
		return this.tokenId;
	}

	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}
	@JsonBackReference("users-user_accesstoken")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", nullable = false, length = 0)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "token", unique = true, nullable = false)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "valid_until", nullable = false, length = 0)
	public Date getValidUntil() {
		return this.validUntil;
	}

	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}

}
