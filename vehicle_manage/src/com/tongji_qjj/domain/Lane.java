package com.tongji_qjj.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author qjj<br>
 *         ������Ϣ
 */
@Entity(name = "lane")
public class Lane implements Serializable {

	private static final long serialVersionUID = -2832217506632954794L;

	@Id
	private Integer id; // �����ţ�������
	private int headCar; // ����ͷ��
	private int tailCar; // ����β��
	@OneToMany(mappedBy = "lane", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<RelationPosition> relationPositions;

	public Lane() {
		super();
		this.relationPositions = new ArrayList<RelationPosition>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getHeadCar() {
		return headCar;
	}

	public void setHeadCar(int headCar) {
		this.headCar = headCar;
	}

	public int getTailCar() {
		return tailCar;
	}

	public void setTailCar(int tailCar) {
		this.tailCar = tailCar;
	}

	public List<RelationPosition> getRelationPositions() {
		return relationPositions;
	}

	public void setRelationPositions(List<RelationPosition> relationPositions) {
		this.relationPositions = relationPositions;
	}

}
