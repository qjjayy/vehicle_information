package com.tongji_qjj.daoImpl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.tongji_qjj.dao.Vehicle_Static_Dao;
import com.tongji_qjj.domain.Vehicle_Static;

@Repository
public class Vehicle_Static_DaoImpl implements Vehicle_Static_Dao {

	@Resource
	private SessionFactory sessionFactory;

	@Override
	public Vehicle_Static selectVehicleStaticDatumByID(int vehicleID) {
		return sessionFactory.getCurrentSession().get(Vehicle_Static.class, vehicleID);
	}

}
