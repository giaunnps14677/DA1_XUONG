package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

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
 * The persistent class for the work_product_priority database table.
 * 
 */
@Table(name="work_product_priority")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="WorkProductPriority.findAll", query="SELECT w FROM WorkProductPriority w")
public class WorkProductPriority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	//bi-directional many-to-one association to WorkProduct
	@OneToMany(mappedBy="workProductPriority")
	private List<WorkProduct> workProducts;


}