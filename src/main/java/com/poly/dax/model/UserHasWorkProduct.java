package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the user_has_work_product database table.
 * 
 */
@Table(name="user_has_work_product")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="UserHasWorkProduct.findAll", query="SELECT u FROM UserHasWorkProduct u")
public class UserHasWorkProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String note;

	private float point;

	@Column(name="submited_at")
	private Timestamp submitedAt;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	//bi-directional many-to-one association to WorkProduct
	@ManyToOne
	@JoinColumn(name="work_product_id")
	private WorkProduct workProduct;

	//bi-directional many-to-one association to WorkProductStatus
	@ManyToOne
	@JoinColumn(name="work_product_status_id")
	private WorkProductStatus workProductStatus;


}