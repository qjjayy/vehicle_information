package com.tongji_qjj.domain;

/**
 * @author qjj<br>
 *         系统中实际使用的车辆类型
 */
public class Vehicle {

	public Integer vehicleID; // 主键

	public float length; // 车长
	public float width; // 车宽
	public int vehicleType; // 车的类别

	public float localX; // 横坐标
	public float localY; // 纵坐标
	public float velocity; // 速度
	public float acceleration; // 加速度

	public int laneID; // 所在车道号
	public Vehicle preceding; // 前方车辆
	public Vehicle following; // 后方车辆
	public float spaceHeadway; // 前方空间间隔
	public float timeHeadway; // 前方时间间隔

	public Vehicle(Integer vehicleID, float length, float width, int vehicleType, float localX, float localY,
			float velocity, float acceleration, int laneID, Vehicle preceding, Vehicle following, float spaceHeadway,
			float timeHeadway) {
		super();
		this.vehicleID = vehicleID;
		this.length = length;
		this.width = width;
		this.vehicleType = vehicleType;
		this.localX = localX;
		this.localY = localY;
		this.velocity = velocity;
		this.acceleration = acceleration;
		this.laneID = laneID;
		this.preceding = preceding;
		this.following = following;
		this.spaceHeadway = spaceHeadway;
		this.timeHeadway = timeHeadway;
	}

}
