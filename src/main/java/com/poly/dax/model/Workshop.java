package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the workshop database table.
 * 
 */
@Table(name="workshop")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="Workshop.findAll", query="SELECT w FROM Workshop w")
public class Workshop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	private String name;

	@Column(name="specialization_id")
	private String specializationId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;

	@Column(name="workshop_manager_id")
	private int workshopManagerId;

	//bi-directional many-to-one association to Major
	@OneToMany(mappedBy="workshop")
	private List<Major> majors;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="workshop")
	private List<User> users;


}