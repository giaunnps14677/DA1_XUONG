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
 * The persistent class for the project database table.
 * 
 */
@Table(name="project")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="created_by")
	private int createdBy;

	@Column(name="deleted_at")
	private Timestamp deletedAt;

	@Column(name="deleted_by")
	private int deletedBy;

	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	private String name;

	private String note;

	private String outcome;

	@Column(name="pm_export")
	private int pmExport;

	@Column(name="poly_coin")
	private int polyCoin;

	private float price;

	private String semester;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="updated_by")
	private int updatedBy;
	
	@Column(name="project_code")
	private String projectCode;

	//bi-directional many-to-one association to Bookmark
	@OneToMany(mappedBy="project")
	private List<Bookmark> bookmarks;

	//bi-directional many-to-one association to File
	@ManyToOne
	@JoinColumn(name="document_zip_file_id")
	private File file;

	//bi-directional many-to-one association to Level
	@ManyToOne
	private Level level;

	//bi-directional many-to-one association to Major
	@ManyToOne
	private Major major;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="owner_id")
	private User user;

	//bi-directional many-to-one association to WorkProductStatus
	@ManyToOne
	@JoinColumn(name="status_id")
	private WorkProductStatus workProductStatus;

	//bi-directional many-to-one association to UserHasProject
	@OneToMany(mappedBy="project")
	private List<UserHasProject> userHasProjects;

	//bi-directional many-to-one association to WorkProduct
	@OneToMany(mappedBy="project")
	private List<WorkProduct> workProducts;

}