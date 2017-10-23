package com.tongji_qjj.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tongji_qjj.domain.pk.RelationPositionPK;

/**
 * @author qjj<br>
 *         车辆相对位置关系
 */
@Entity(name = "relation_position")
@IdClass(RelationPositionPK.class)
public class RelationPosition implements Serializable {

	private static final long serialVersionUID = 4216679586477488332L;

	@Id
	@GeneratedValue
	private Integer index; // 序号
	private int preceding; // 前方车辆号
	private int following; // 后方车辆号
	@Id
	@ManyToOne
	@JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;
	@ManyToOne
	@JoinColumn(name = "lane_id")
	private Lane lane;

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Lane getLane() {
		return lane;
	}

	public void setLane(Lane lane) {
		this.lane = lane;
	}

}
