package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the major database table.
 * 
 */

@Table(name="major")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//@NamedQuery(name="Major.findAll", query="SELECT m FROM Major m")
public class Major implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="created_by")
	private int createdBy;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	private String name;

	//bi-directional many-to-one association to Workshop
	@ManyToOne
	private Workshop workshop;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="major")
	private List<Project> projects;
	
	@OneToMany
	private List<User> users;

	//bi-directional many-to-one association to User
//	@OneToMany(mappedBy="major1")
//	private List<User> users;

}