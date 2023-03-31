package com.poly.dax.model;

import java.io.Serializable;
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
 * The persistent class for the failed_jobs database table.
 * 
 */
@Table(name="failed_jobs")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="FailedJob.findAll", query="SELECT f FROM FailedJob f")
public class FailedJob implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Lob
	private String connection;

	@Lob
	private String exception;

	@Column(name="failed_at")
	private Timestamp failedAt;

	@Lob
	private String payload;

	@Lob
	private String queue;

	private String uuid;


}