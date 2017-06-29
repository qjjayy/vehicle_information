package com.tongji_qjj.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tongji_qjj.dao.Vehicle_Dynamic_Dao;
import com.tongji_qjj.domain.Vehicle_Dynamic;
import com.tongji_qjj.service.Vehicle_Dynamic_Service;

@Service
@Transactional
public class Vehicle_Dynamic_ServiceImpl implements Vehicle_Dynamic_Service {

	@Resource
	private Vehicle_Dynamic_Dao vehicle_dynamic_dao;

	@Override
	public Vehicle_Dynamic getVehicleDynamicDatumByIDs(int frameID, int vehicleID) {
		return vehicle_dynamic_dao.selectVehicleDynamicDatumByIDs(frameID, vehicleID);
	}

}
