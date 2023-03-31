package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the work_product_status database table.
 * 
 */
@Table(name="work_product_status")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="WorkProductStatus.findAll", query="SELECT w FROM WorkProductStatus w")
public class WorkProductStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="_order")
	private int order;

	private String name;

	private String value;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="workProductStatus")
	private List<Project> projects;

	//bi-directional many-to-one association to UserHasWorkProduct
	@OneToMany(mappedBy="workProductStatus")
	private List<UserHasWorkProduct> userHasWorkProducts;

	//bi-directional many-to-one association to WorkProduct
	@OneToMany(mappedBy="workProductStatus")
	private List<WorkProduct> workProducts;


}