package com.tongji_qjj.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

/**
 * @author qjj<br>
 *         ������̬����
 */
@Entity(name = "vehicle")
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 3783792794038572229L;

	@Id
	private Integer id; // �����ţ�������
	private float length; // ����
	private float width; // ����
	@Enumerated(EnumType.ORDINAL)
	private VehicleType vehicleType; // �������
	private int totalFrames; // �ܵ�֡��
	@OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderBy("index")
	private List<VehicleDynamic> dynamicDatum;
	@OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderBy("index")
	private List<RelationPosition> relationPositions;

	public Vehicle() {
		super();
		this.dynamicDatum = new ArrayList<VehicleDynamic>();
		this.relationPositions = new ArrayList<RelationPosition>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getTotalFrames() {
		return totalFrames;
	}

	public void setTotalFrames(int totalFrames) {
		this.totalFrames = totalFrames;
	}

	public List<VehicleDynamic> getDynamicDatum() {
		return dynamicDatum;
	}

	public void setDynamicDatum(List<VehicleDynamic> dynamicDatum) {
		this.dynamicDatum = dynamicDatum;
	}

	public List<RelationPosition> getRelationPositions() {
		return relationPositions;
	}

	public void setRelationPositions(List<RelationPosition> relationPositions) {
		this.relationPositions = relationPositions;
	}

}
