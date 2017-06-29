package com.tongji_qjj.daoImpl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.tongji_qjj.dao.Vehicle_Dynamic_Dao;
import com.tongji_qjj.domain.Vehicle_Dynamic;

@Repository
public class Vehicle_Dynamic_DaoImpl implements Vehicle_Dynamic_Dao {

	@Resource
	private SessionFactory sessionFactory;

	@Override
	public Vehicle_Dynamic selectVehicleDynamicDatumByIDs(int frameID, int vehicleID) {
		Vehicle_Dynamic.UnionPK unionPK = new Vehicle_Dynamic.UnionPK(frameID, vehicleID);
		return sessionFactory.getCurrentSession().get(Vehicle_Dynamic.class, unionPK);
	}

}
