// package com.tongji_qjj.test;
//
// import javax.annotation.Resource;
//
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;
// import org.springframework.stereotype.Component;
//
// import com.tongji_qjj.service.Vehicle_Dynamic_Service;
// import com.tongji_qjj.service.Vehicle_Static_Service;
//
// @Component("tabletest")
// public class TableTest {
//
// @Resource
// private Vehicle_Static_Service staticService;
// @Resource
// private Vehicle_Dynamic_Service dynamicService;
//
// public static void main(String[] args) {
// @SuppressWarnings("resource")
// ApplicationContext ac = new
// ClassPathXmlApplicationContext("applicationContext.xml");
// TableTest table = (TableTest) ac.getBean("tabletest");
// table.test();
// }
//
// public void test() {
// staticService.getVehicleStaticDatumById(0);
// dynamicService.getVehicleDynamicDatumByIDs(0, 0);
// }
// }
