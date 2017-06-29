package com.tongji_qjj.domain;

import java.io.Serializable;

/**
 * @author qjj<br>
 *         数据库中动态部分
 *
 */
public class Vehicle_Dynamic implements Serializable {

	private static final long serialVersionUID = -575540731255146905L;

	// 联合主键：frameID和vehicleID
	public static class UnionPK implements Serializable {

		private static final long serialVersionUID = 5438333592696558014L;

		private Integer frameID;
		private Integer vehicleID;

		public UnionPK() {
			super();
		}

		public UnionPK(Integer frameID, Integer vehicleID) {
			super();
			this.frameID = frameID;
			this.vehicleID = vehicleID;
		}

		public Integer getFrameID() {
			return frameID;
		}

		public void setFrameID(Integer frameID) {
			this.frameID = frameID;
		}

		public Integer getVehicleID() {
			return vehicleID;
		}

		public void setVehicleID(Integer vehicleID) {
			this.vehicleID = vehicleID;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((frameID == null) ? 0 : frameID.hashCode());
			result = prime * result + ((vehicleID == null) ? 0 : vehicleID.hashCode());
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
			UnionPK other = (UnionPK) obj;
			if (frameID == null) {
				if (other.frameID != null)
					return false;
			} else if (!frameID.equals(other.frameID))
				return false;
			if (vehicleID == null) {
				if (other.vehicleID != null)
					return false;
			} else if (!vehicleID.equals(other.vehicleID))
				return false;
			return true;
		}

	}

	private UnionPK unionID; // 联合主键
	private Vehicle_Static staticData; // 对应静态数据(关联关系)

	private float localX; // 横坐标
	private float localY; // 纵坐标
	private float velocity; // 速度
	private float acceleration; // 加速度

	private int laneID; // 所在车道号
	private Vehicle_Static preceding; // 前方车辆
	private Vehicle_Static following; // 后方车辆
	private float spaceHeadway; // 前方空间间隔
	private float timeHeadway; // 前方时间间隔

	public Vehicle_Dynamic() {
		super();
		unionID = new UnionPK();
	}

	public UnionPK getUnionID() {
		return unionID;
	}

	public void setUnionID(UnionPK unionID) {
		this.unionID = unionID;
	}

	public int getFrameID() {
		return this.unionID.frameID;
	}

	public void setFrameID(Integer frameID) {
		this.unionID.frameID = frameID;
	}

	public Vehicle_Static getStaticData() {
		return staticData;
	}

	public void setStaticData(Vehicle_Static staticData) {
		this.staticData = staticData;
		this.unionID.vehicleID = staticData.getVehicleID();
		staticData.getDynamicDatum().add(this);
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

	public int getLaneID() {
		return laneID;
	}

	public void setLaneID(int laneID) {
		this.laneID = laneID;
	}

	public Vehicle_Static getPreceding() {
		return preceding;
	}

	public void setPreceding(Vehicle_Static preceding) {
		this.preceding = preceding;
	}

	public Vehicle_Static getFollowing() {
		return following;
	}

	public void setFollowing(Vehicle_Static following) {
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
