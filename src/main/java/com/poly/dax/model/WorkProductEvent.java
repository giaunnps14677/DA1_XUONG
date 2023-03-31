package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the work_product_event database table.
 * 
 */
@Table(name="work_product_event")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="WorkProductEvent.findAll", query="SELECT w FROM WorkProductEvent w")
public class WorkProductEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="created_by")
	private int createdBy;

	private String message;

	private String note;

	@Column(name="type_id")
	private int typeId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="workproduct_id")
	private int workproductId;

}