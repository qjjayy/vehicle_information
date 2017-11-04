package com.tongji_qjj.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 6465111091951478458L;
	private File file = new File("");

	public MainFrame(String name) {
		super(name);
		add(new ImagePanel());
	}

	public static void main(String[] args) {
		JFrame frame = new MainFrame("VehicleManage");

		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class ImagePanel extends JPanel {
		private static final long serialVersionUID = -867375613761642072L;
		private ImageIcon imageIcon = new ImageIcon("image/lane_origin.jpg");
		private Image image = imageIcon.getImage();
		private String message = "location: ";
		private int coordinateX = 0;
		private int coordinateY = 0;
		private List<Point> coordinateList;

		public ImagePanel() {
			coordinateList = new ArrayList<Point>();

			addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					coordinateX = e.getX();
					coordinateY = e.getY();
					System.out.println("location: " + coordinateX + ", " + coordinateY);
					coordinateList.add(new Point(coordinateX, coordinateY));
					message = "location: " + coordinateX + ", " + coordinateY;
					repaint();

					// Point point = null;
					// try (PrintWriter fileOutput = new PrintWriter(file)) {
					// for (int i = 0; i < coordinateList.size(); i++) {
					// point = coordinateList.get(i);
					// coordinateX = (int) point.getX();
					// coordinateY = (int) point.getY();
					// fileOutput.println("location: " + coordinateX + ", " +
					// coordinateY);
					// }
					// } catch (FileNotFoundException e1) {
					// e1.printStackTrace();
					// }

					Point point1 = null;
					Point point2 = null;
					int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
					double distance = 0;
					if (coordinateList.size() > 1) {
						try (PrintWriter fileOutput = new PrintWriter(file)) {
							for (int i = 1; i < coordinateList.size(); i++) {
								point1 = coordinateList.get(i - 1);
								x1 = (int) point1.getX();
								y1 = (int) point1.getY();
								point2 = coordinateList.get(i);
								x2 = (int) point2.getX();
								y2 = (int) point2.getY();
								distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
								fileOutput.println("distance: " + distance);
							}
						} catch (FileNotFoundException e1) {
							e1.printStackTrace();
						}
					}

				}

			});

			addMouseMotionListener(new MouseMotionAdapter() {

				// @Override
				// public void mouseMoved(MouseEvent e) {
				// coordinateX = e.getX();
				// coordinateY = e.getY();
				// coordinateList.add(new Point(coordinateX, coordinateY));
				// message = "location: " + coordinateX + ", " + coordinateY;
				// repaint();
				// }

			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			if (image != null) {
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
			}
			g.drawString(message, coordinateX, coordinateY);

			Point point1 = null;
			Point point2 = null;
			int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
			g.setColor(Color.RED);
			if (coordinateList.size() > 1) {
				for (int i = 1; i < coordinateList.size(); i++) {
					point1 = coordinateList.get(i - 1);
					x1 = (int) point1.getX();
					y1 = (int) point1.getY();
					point2 = coordinateList.get(i);
					x2 = (int) point2.getX();
					y2 = (int) point2.getY();
					g.drawLine(x1, y1, x2, y2);
				}
			}
			g.setColor(Color.PINK);
		}

	}

}
