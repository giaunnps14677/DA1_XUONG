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
 * The persistent class for the comment database table.
 * 
 */
@Table(name="comment")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="Comment.findAll", query="SELECT c FROM Comment c")
public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="created_by")
	private int createdBy;

	private String message;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="user_has_workproduct_id")
	private int userHasWorkproductId;

	//bi-directional many-to-one association to WorkProduct
	@OneToMany(mappedBy="comment")
	private List<WorkProduct> workProducts;

}