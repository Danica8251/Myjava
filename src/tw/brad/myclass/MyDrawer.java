package tw.brad.myclass;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

// 簽名板

public class MyDrawer extends JPanel {
	
	// 3-6
	private LinkedList<HashMap<String, Integer>> line; // 由無數多個點(HashMap<String, Integer>) 構成的線
	
	// 3-2
	public MyDrawer() {
		
		// 3-2 簽名板背景為黃色
		setBackground(Color.YELLOW); 
	
		// 3-5 觸發
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
	
	}
	
	// 3-3 畫 
	@Override // override => 把父類別拿來改善改良
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
//		// 額外測試
//		if(g instanceof Graphics) {
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}

//		// 額外測試
//		if(g instanceof Graphics2D) {
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
		
		Graphics2D g2d = (Graphics2D)g; // 設計線條=>類似小畫家的畫筆
		
		g2d.setColor(Color.BLUE); //畫筆顏色
		g2d.setStroke(new BasicStroke(4)); // 畫筆粗細
		
		g2d.drawLine(0, 0, 200, 100); // 畫線條
		
	}
	
	// 3-4 與使用者互動，能夠偵測滑鼠的行為(位置)
	private class MyListener extends MouseAdapter{ // 類別中的類別，因為方便存取外部類別的屬性跟方法
		@Override
		public void mousePressed(MouseEvent e) { // 有{ }就有實作
			// TODO Auto-generated method stub
			// super.mousePressed(e);
			
			// 測試
//			System.out.println("Press");
			
			// 3-5-1
			System.out.println("Press:" + e.getX() + "*" + e.getY());
		}
		
		@Override
		public void mouseDragged(MouseEvent e) { // 有{ }就有實作
			// TODO Auto-generated method stub
			// super.mouseDragged(e);
		
			// 測試
//			System.out.println("Drag");
			
			//3-5-1
			System.out.println("Drag:"+ e.getX() + "*" + e.getY());

			
			}
	}
	
}
