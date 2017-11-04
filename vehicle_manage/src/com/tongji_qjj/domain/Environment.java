package com.tongji_qjj.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.tongji_qjj.domain.pk.EnvironmentPK;

/**
 * @author qjj<br>
 *         原始数据
 *
 */
@Entity(name = "environment")
@IdClass(EnvironmentPK.class)
public class Environment implements Serializable {

	private static final long serialVersionUID = -575540731255146905L;

	@Id
	private Integer frameId; // 帧次序
	@Id
	private Integer vehicleId; // 车辆ID
	private float localX; // 横坐标
	private float localY; // 纵坐标
	private float velocity; // 速度
	private float acceleration; // 加速度

	private int laneId; // 所在车道号
	private int preceding; // 前方车辆号
	private int following; // 后方车辆号
	private float spaceHeadway; // 前方空间间隔
	private float timeHeadway; // 前方时间间隔

	public Environment() {
		super();
	}

	public EnvironmentPK getId() {
		return new EnvironmentPK(frameId, vehicleId);
	}

	public void setId(EnvironmentPK id) {
		this.frameId = id.getFrameId();
		this.vehicleId = id.getVehicleId();
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

	public int getLaneId() {
		return laneId;
	}

	public void setLaneId(int laneId) {
		this.laneId = laneId;
	}

	public int getPreceding() {
		return preceding;
	}

	public void setPreceding(int preceding) {
		this.preceding = preceding;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
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

}
