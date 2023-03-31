package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * The persistent class for the work_product database table.
 * 
 */
@Table(name="work_product")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="WorkProduct.findAll", query="SELECT w FROM WorkProduct w")
public class WorkProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="deleted_at")
	private Timestamp deletedAt;

	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="due_time")
	private Date dueTime;

	private String name;

	private String note;

	@Column(name="poly_coin")
	private int polyCoin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to UserHasWorkProduct
	@OneToMany(mappedBy="workProduct")
	private List<UserHasWorkProduct> userHasWorkProducts;

	//bi-directional many-to-one association to Comment
	@ManyToOne
	private Comment comment;

	//bi-directional many-to-one association to File
	@ManyToOne
	private File file;

	//bi-directional many-to-one association to Project
	@ManyToOne
	private Project project;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="created_by")
	private User user;

	//bi-directional many-to-one association to WorkProductPriority
	@ManyToOne
	@JoinColumn(name="work_product_priority_id")
	private WorkProductPriority workProductPriority;

	//bi-directional many-to-one association to WorkProductStatus
	@ManyToOne
	@JoinColumn(name="work_product_status_id")
	private WorkProductStatus workProductStatus;

}