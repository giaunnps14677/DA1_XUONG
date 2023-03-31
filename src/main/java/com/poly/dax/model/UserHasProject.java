package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the user_has_project database table.
 * 
 */
@Table(name="user_has_project")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="UserHasProject.findAll", query="SELECT u FROM UserHasProject u")
public class UserHasProject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String note;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="user_id")
	private int userId;

	@Column(name="work_product_status_id")
	private int workProductStatusId;

	//bi-directional many-to-one association to Project
	@ManyToOne
	private Project project;

}