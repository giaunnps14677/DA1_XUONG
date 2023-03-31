package com.poly.dax.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the model_has_permissions database table.
 * 
 */
@Embeddable
public class ModelHasPermissionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="permission_id")
	private long permissionId;

	@Column(name="model_id")
	private long modelId;

	@Column(name="model_type")
	private String modelType;

	public ModelHasPermissionPK() {
	}
	public long getPermissionId() {
		return this.permissionId;
	}
	public void setPermissionId(long permissionId) {
		this.permissionId = permissionId;
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
		if (!(other instanceof ModelHasPermissionPK)) {
			return false;
		}
		ModelHasPermissionPK castOther = (ModelHasPermissionPK)other;
		return 
			(this.permissionId == castOther.permissionId)
			&& (this.modelId == castOther.modelId)
			&& this.modelType.equals(castOther.modelType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.permissionId ^ (this.permissionId >>> 32)));
		hash = hash * prime + ((int) (this.modelId ^ (this.modelId >>> 32)));
		hash = hash * prime + this.modelType.hashCode();
		
		return hash;
	}
}