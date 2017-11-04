package com.tongji_qjj.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.tongji_qjj.domain.pk.EnvironmentPK;

/**
 * @author qjj<br>
 *         ԭʼ����
 *
 */
@Entity(name = "environment")
@IdClass(EnvironmentPK.class)
public class Environment implements Serializable {

	private static final long serialVersionUID = -575540731255146905L;

	@Id
	private Integer frameId; // ֡����
	@Id
	private Integer vehicleId; // ����ID
	private float localX; // ������
	private float localY; // ������
	private float velocity; // �ٶ�
	private float acceleration; // ���ٶ�

	private int laneId; // ���ڳ�����
	private int preceding; // ǰ��������
	private int following; // �󷽳�����
	private float spaceHeadway; // ǰ���ռ���
	private float timeHeadway; // ǰ��ʱ����

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
