package com.tongji_qjj.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author qjj<br>
 *         ���ݿ��о�̬����
 *
 */
public class Vehicle_Static implements Serializable {

	private static final long serialVersionUID = 4402026872352254836L;

	private Integer vehicleID; // ����

	private Set<Vehicle_Dynamic> dynamicDatum; // ��Ӧ�Ķ�̬���ݣ�������ϵ��

	private float length; // ����
	private float width; // ����
	private int type; // �������

	private int totalFrames; // ����ͷ��¼����֡��

	public Vehicle_Static() {
		super();
		dynamicDatum = new HashSet<Vehicle_Dynamic>();
	}

	public Integer getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(Integer vehicleID) {
		this.vehicleID = vehicleID;
	}

	public Set<Vehicle_Dynamic> getDynamicDatum() {
		return dynamicDatum;
	}

	public void setDynamicDatum(Set<Vehicle_Dynamic> dynamicDatum) {
		this.dynamicDatum = dynamicDatum;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getTotalFrames() {
		return totalFrames;
	}

	public void setTotalFrames(int totalFrames) {
		this.totalFrames = totalFrames;
	}

}
