package com.poly.dax.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the model_has_roles database table.
 * 
 */
@Embeddable
public class ModelHasRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="role_id")
	private long roleId;

	@Column(name="model_id")
	private long modelId;

	@Column(name="model_type")
	private String modelType;

	public ModelHasRolePK() {
	}
	public long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public long getModelId() {
		return this.modelId;
	}
	public void setModelId(long modelId) {
		this.modelId = modelId;
	}
	public String getModelType() {
		return this.modelType;
	}
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ModelHasRolePK)) {
			return false;
		}
		ModelHasRolePK castOther = (ModelHasRolePK)other;
		return 
			(this.roleId == castOther.roleId)
			&& (this.modelId == castOther.modelId)
			&& this.modelType.equals(castOther.modelType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		hash = hash * prime + ((int) (this.modelId ^ (this.modelId >>> 32)));
		hash = hash * prime + this.modelType.hashCode();
		
		return hash;
	}
}