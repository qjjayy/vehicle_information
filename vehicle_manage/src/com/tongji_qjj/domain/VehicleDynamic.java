package com.tongji_qjj.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tongji_qjj.domain.pk.VehicleDynamicPK;

/**
 * @author qjj<br>
 *         车辆动态属性
 */
@Entity(name = "vehicle_dynamic")
@IdClass(VehicleDynamicPK.class)
public class VehicleDynamic implements Serializable {

	private static final long serialVersionUID = -5155326380906990463L;

	@Id
	@GeneratedValue
	private Integer hisIndex; // 序号
	@Id
	@Column(name = "vehicle_id", insertable = false, updatable = false)
	private Integer vehicleId; // 关联车辆号
	private float localX; // 横坐标
	private float localY; // 纵坐标
	private float velocity; // 速度
	private float acceleration; // 加速度
	private float spaceHeadway; // 前方空间间隔
	private float timeHeadway; // 前方时间间隔

	@ManyToOne
	@JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;

	public VehicleDynamic() {
		super();
	}

	public VehicleDynamicPK getId() {
		return new VehicleDynamicPK(hisIndex, vehicleId);
	}

	public void setId(VehicleDynamicPK id) {
		this.hisIndex = id.getHisIndex();
		this.vehicleId = id.getVehicleId();
	}

	public Integer getHisIndex() {
		return hisIndex;
	}

	public void setHisIndex(Integer hisIndex) {
		this.hisIndex = hisIndex;
	}

	public float getLocalX() {
		return localX;
	}

	public void setLocalX(float localX) {
		this.localX = localX;
	}

	public float getLocalY() {
		return localY;
	}

	public void setLocalY(float localY) {
		this.localY = localY;
	}

	public float getVelocity() {
		return velocity;
	}

	public void setVelocity(float velocity) {
		this.velocity = velocity;
	}

	public float getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(float acceleration) {
		this.acceleration = acceleration;
	}

	public float getSpaceHeadway() {
		return spaceHeadway;
	}

	public void setSpaceHeadway(float spaceHeadway) {
		this.spaceHeadway = spaceHeadway;
	}

	public float getTimeHeadway() {
		return timeHeadway;
	}

	public void setTimeHeadway(float timeHeadway) {
		this.timeHeadway = timeHeadway;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
