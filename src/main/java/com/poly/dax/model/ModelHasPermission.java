package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the model_has_permissions database table.
 * 
 */
@Table(name="model_has_permissions")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="ModelHasPermission.findAll", query="SELECT m FROM ModelHasPermission m")
public class ModelHasPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModelHasPermissionPK id;

}