package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the users database table.
 * 
 */
@Table(name="users")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String avatar;

	@Column(name="course_name")
	private String courseName;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String email;

	@Column(name="google_id")
	private String googleId;

	private String name;

	private String password;

	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="project_id")
	private int projectId;

	@Column(name="role_id")
	private int roleId;

	@Column(name="student_code")
	private String studentCode;

	@Column(name="teacher_code")
	private String teacherCode;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Major
//	@OneToMany(mappedBy="user")
//	private List<Major> majors;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="user")
	private List<Project> projects;

	//bi-directional many-to-one association to Role
	@OneToMany(mappedBy="user")
	private List<Role> roles;

	//bi-directional many-to-one association to UserHasWorkProduct
	@OneToMany(mappedBy="user")
	private List<UserHasWorkProduct> userHasWorkProducts;


	//bi-directional many-to-one association to Major
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="major_id",insertable =false, updatable =false)
	private Major major;

	//bi-directional many-to-one association to Workshop
	@ManyToOne
	@JoinColumn(name="major_id",insertable =false, updatable =false)
	private Workshop workshop;

	//bi-directional many-to-one association to WorkProduct
	@OneToMany(mappedBy="user")
	private List<WorkProduct> workProducts;


}