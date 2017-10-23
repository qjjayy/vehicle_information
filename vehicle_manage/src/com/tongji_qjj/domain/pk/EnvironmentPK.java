package com.tongji_qjj.domain.pk;

import java.io.Serializable;

public class EnvironmentPK implements Serializable {

	private static final long serialVersionUID = -3630047990115401996L;

	private Integer frameId;
	private Integer vehicleId;

	public EnvironmentPK() {
	}

	public EnvironmentPK(Integer frameId, Integer vehicleId) {
		super();
		this.frameId = frameId;
		this.vehicleId = vehicleId;
	}

	public Integer getFrameId() {
		return frameId;
	}

	public void setFrameId(Integer frameId) {
		this.frameId = frameId;
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((frameId == null) ? 0 : frameId.hashCode());
		result = prime * result + ((vehicleId == null) ? 0 : vehicleId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnvironmentPK other = (EnvironmentPK) obj;
		if (frameId == null) {
			if (other.frameId != null)
				return false;
		} else if (!frameId.equals(other.frameId))
			return false;
		if (vehicleId == null) {
			if (other.vehicleId != null)
				return false;
		} else if (!vehicleId.equals(other.vehicleId))
			return false;
		return true;
	}

}
