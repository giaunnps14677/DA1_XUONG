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
 * The persistent class for the model_has_roles database table.
 * 
 */
@Table(name="model_has_roles")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="ModelHasRole.findAll", query="SELECT m FROM ModelHasRole m")
public class ModelHasRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModelHasRolePK id;

}