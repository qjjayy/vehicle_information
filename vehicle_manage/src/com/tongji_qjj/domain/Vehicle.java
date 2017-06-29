package com.tongji_qjj.domain;

/**
 * @author qjj<br>
 *         ϵͳ��ʵ��ʹ�õĳ�������
 */
public class Vehicle {

	public Integer vehicleID; // ����

	public float length; // ����
	public float width; // ����
	public int vehicleType; // �������

	public float localX; // ������
	public float localY; // ������
	public float velocity; // �ٶ�
	public float acceleration; // ���ٶ�

	public int laneID; // ���ڳ�����
	public Vehicle preceding; // ǰ������
	public Vehicle following; // �󷽳���
	public float spaceHeadway; // ǰ���ռ���
	public float timeHeadway; // ǰ��ʱ����

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
