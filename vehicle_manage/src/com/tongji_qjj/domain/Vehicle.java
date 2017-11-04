package com.tongji_qjj.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;

/**
 * @author qjj<br>
 *         车辆静态属性
 */
@Entity(name = "vehicle")
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 3783792794038572229L;

	@Id
	private Integer id; // 车辆号（主键）
	private float length; // 车长
	private float width; // 车宽
	@Enumerated(EnumType.ORDINAL)
	private VehicleType vehicleType; // 车的类别
	private int totalFrames; // 总的帧数

	@OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderBy("hisIndex")
	private List<VehicleDynamic> dynamicDatum;
	// 相对位置关系
	@OneToOne(mappedBy = "nextVehicle", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
	private Vehicle prevVehicle;
	@OneToOne
	@JoinColumn(name = "next_vehicle_id", unique = true)
	private Vehicle nextVehicle;
	@OneToOne(mappedBy = "rightNextVehicle", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
	private Vehicle leftPrevVehicle;
	@OneToOne
	@JoinColumn(name = "right_next_vehicle_id", unique = true)
	private Vehicle rightNextVehicle;
	@OneToOne(mappedBy = "rightPrevVehicle", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
	private Vehicle leftNextVehicle;
	@OneToOne
	@JoinColumn(name = "right_pre_vehicle_id", unique = true)
	private Vehicle rightPrevVehicle;
	@OneToMany(mappedBy = "rightInVehicle", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
	private List<Vehicle> leftMediumVehicles;
	@OneToMany(mappedBy = "leftInVehicle", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
	private List<Vehicle> rightMediumVehicles;
	@ManyToOne
	@JoinColumn(name = "right_in_vehicle_id")
	private Vehicle rightInVehicle;
	@ManyToOne
	@JoinColumn(name = "left_in_vehicle_id")
	private Vehicle leftInVehicle;

	public Vehicle() {
		super();
		this.dynamicDatum = new ArrayList<VehicleDynamic>();
		this.leftMediumVehicles = new ArrayList<Vehicle>();
		this.rightMediumVehicles = new ArrayList<Vehicle>();
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

	public Vehicle getPrevVehicle() {
		return prevVehicle;
	}

	public void setPrevVehicle(Vehicle prevVehicle) {
		this.prevVehicle = prevVehicle;
	}

	public Vehicle getNextVehicle() {
		return nextVehicle;
	}

	public void setNextVehicle(Vehicle nextVehicle) {
		this.nextVehicle = nextVehicle;
	}

	public Vehicle getLeftPrevVehicle() {
		return leftPrevVehicle;
	}

	public void setLeftPrevVehicle(Vehicle leftPrevVehicle) {
		this.leftPrevVehicle = leftPrevVehicle;
	}

	public Vehicle getLeftNextVehicle() {
		return leftNextVehicle;
	}

	public void setLeftNextVehicle(Vehicle leftNextVehicle) {
		this.leftNextVehicle = leftNextVehicle;
	}

	public Vehicle getRightPrevVehicle() {
		return rightPrevVehicle;
	}

	public void setRightPrevVehicle(Vehicle rightPrevVehicle) {
		this.rightPrevVehicle = rightPrevVehicle;
	}

	public Vehicle getRightNextVehicle() {
		return rightNextVehicle;
	}

	public void setRightNextVehicle(Vehicle rightNextVehicle) {
		this.rightNextVehicle = rightNextVehicle;
	}

	public List<Vehicle> getLeftMediumVehicles() {
		return leftMediumVehicles;
	}

	public void setLeftMediumVehicles(List<Vehicle> leftMediumVehicles) {
		this.leftMediumVehicles = leftMediumVehicles;
	}

	public List<Vehicle> getRightMediumVehicles() {
		return rightMediumVehicles;
	}

	public void setRightMediumVehicles(List<Vehicle> rightMediumVehicles) {
		this.rightMediumVehicles = rightMediumVehicles;
	}

	public Vehicle getRightInVehicle() {
		return rightInVehicle;
	}

	public void setRightInVehicle(Vehicle rightInVehicle) {
		this.rightInVehicle = rightInVehicle;
	}

	public Vehicle getLeftInVehicle() {
		return leftInVehicle;
	}

	public void setLeftInVehicle(Vehicle leftInVehicle) {
		this.leftInVehicle = leftInVehicle;
	}

}
