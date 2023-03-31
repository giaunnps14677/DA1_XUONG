package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the file database table.
 * 
 */
@Table(name="file")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="File.findAll", query="SELECT f FROM File f")
public class File implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="fileable_id")
	private int fileableId;

	@Column(name="fileable_type")
	private String fileableType;

	private String name;

	@Lob
	private String path;

	private int size;

	@Lob
	private String type;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="file")
	private List<Project> projects;

	//bi-directional many-to-one association to WorkProduct
	@OneToMany(mappedBy="file")
	private List<WorkProduct> workProducts;


}