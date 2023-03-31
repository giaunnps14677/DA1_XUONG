package com.poly.dax.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the personal_access_tokens database table.
 * 
 */
@Table(name="personal_access_tokens")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="PersonalAccessToken.findAll", query="SELECT p FROM PersonalAccessToken p")
public class PersonalAccessToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Lob
	private String abilities;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="expires_at")
	private Timestamp expiresAt;

	@Column(name="last_used_at")
	private Timestamp lastUsedAt;

	private String name;

	private String token;

	@Column(name="tokenable_id")
	private BigInteger tokenableId;

	@Column(name="tokenable_type")
	private String tokenableType;

	@Column(name="updated_at")
	private Timestamp updatedAt;

}