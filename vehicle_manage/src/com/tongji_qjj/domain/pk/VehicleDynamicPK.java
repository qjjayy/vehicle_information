package com.tongji_qjj.domain.pk;

import java.io.Serializable;

public class VehicleDynamicPK implements Serializable {

	private static final long serialVersionUID = 6906364741003410087L;

	private Integer hisIndex;
	private Integer vehicleId;

	public VehicleDynamicPK() {
	}

	public VehicleDynamicPK(int hisIndex, int vehicleId) {
		super();
		this.hisIndex = hisIndex;
		this.vehicleId = vehicleId;
	}

	public Integer getHisIndex() {
		return hisIndex;
	}

	public void setHisIndex(Integer hisIndex) {
		this.hisIndex = hisIndex;
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hisIndex == null) ? 0 : hisIndex.hashCode());
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
		VehicleDynamicPK other = (VehicleDynamicPK) obj;
		if (hisIndex == null) {
			if (other.hisIndex != null)
				return false;
		} else if (!hisIndex.equals(other.hisIndex))
			return false;
		if (vehicleId == null) {
			if (other.vehicleId != null)
				return false;
		} else if (!vehicleId.equals(other.vehicleId))
			return false;
		return true;
	}

}
