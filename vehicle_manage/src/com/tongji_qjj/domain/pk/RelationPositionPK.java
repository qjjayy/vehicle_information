package com.tongji_qjj.domain.pk;

import java.io.Serializable;

import com.tongji_qjj.domain.Vehicle;

public class RelationPositionPK implements Serializable {

	private static final long serialVersionUID = 3693973507093036001L;

	private int index;
	private Vehicle vehicle;

	public RelationPositionPK() {
		super();
	}

	public RelationPositionPK(int index, Vehicle vehicle) {
		super();
		this.index = index;
		this.vehicle = vehicle;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
