package com.tongji_qjj.frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JPanel;

import com.tongji_qjj.domain.Vehicle;
import com.tongji_qjj.service.RoadInfoService;
import com.tongji_qjj.service.VehicleInfoService;

public class LanePanel extends JPanel {

	private static final long serialVersionUID = 653793925035103126L;
	private RoadInfoService roadInfoService;
	private VehicleInfoService vehicleInfoService;
	private Map<Integer, Point> currentLocation;
	private Vehicle vehicle;

	public LanePanel() {

	}

	public void actionPerformed() {
		currentLocation = roadInfoService.getVehicleLocations();
		if (!currentLocation.isEmpty()) {
			repaint();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GRAY);
		for (Entry<Integer, Point> itemInfo : currentLocation.entrySet()) {
			paintVehicle(g, itemInfo.getKey(), itemInfo.getValue());
		}
	}

	private void paintVehicle(Graphics g, int vehicleId, Point point) {
		vehicle = vehicleInfoService.getInfoById(vehicleId);
		float vehicleLength = vehicle.getLength();
		float vehicleWidth = vehicle.getWidth();
		int coordinateX = (int) (point.getX() - vehicleLength / 2);
		int coordinateY = (int) (point.getY() - vehicleWidth / 2);
		if (coordinateX > 0 && coordinateY > 0) {
			g.fillRect(coordinateX, coordinateY, (int) vehicleLength, (int) vehicleWidth);
		}
	}
}
