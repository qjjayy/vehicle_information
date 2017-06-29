package com.tongji_qjj.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tongji_qjj.dao.Vehicle_Static_Dao;
import com.tongji_qjj.domain.Vehicle_Static;
import com.tongji_qjj.service.Vehicle_Static_Service;

@Service
@Transactional
public class Vehicle_Static_ServiceImpl implements Vehicle_Static_Service {

	@Resource
	private Vehicle_Static_Dao vehicle_static_dao;

	@Override
	public Vehicle_Static getVehicleStaticDatumById(int vehicleID) {
		return vehicle_static_dao.selectVehicleStaticDatumByID(vehicleID);
	}

}
