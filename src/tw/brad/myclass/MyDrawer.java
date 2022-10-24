//package tw.brad.myclass;
//
//import java.awt.*;
//import java.awt.event.*;
//import java.util.*;
//import javax.swing.JPanel;
//
//// 簽名板
//// 核心精神:資料結構
//
//public class MyDrawer extends JPanel {
//	
//	// 3-6
////	private LinkedList<HashMap<String, Integer>> line; // 由無數多個點(HashMap<String, Integer>) 構成的線
//													   // Line<Point>
//	
//	
//	// 3-11-1 多條線
////	private LinkedList<LinkedList<HashMap<String, Integer>>> lines; // 由無數多個點(HashMap<String, Integer>) 構成的線
//																	// Line<Point>
//	
//	// 3-13-2 另一種寫法:多條線 詳解要看老師的Code
////	private LinkedList<LinkedList<Point>> point; // 由無數多個點(HashMap<String, Integer>) 構成的線
//																	// Line<Point>
//	
//	private LinkedList<LinkedList<Point>> lines, recyler; // Lines<Line<Point>>
//	
//	
//	// 3-2
//	public MyDrawer() {
//		
//		// 3-2 簽名板背景為黃色
//		setBackground(Color.YELLOW); 
//	
//		// 3-5 觸發
//		MyListener myListener = new MyListener();
//		addMouseListener(myListener);
//		addMouseMotionListener(myListener);
//		
//		// 3-7 初始化
////		line = new LinkedList<>();
//		
//		// 3-11-2
//		lines = new LinkedList<>();
//		
//		recyler = new LinkedList<>();
//	
//	}
//	
//	// 3-15 資料結構清除，畫面清除要加repaint
//	public void clear() {
//		lines.clear();
//		repaint();
//	}
//	
//	public void undo() {
//		recyler.add(lines.removeLast());
//		repaint();
//	}
//	
//	public void redo() {
//		lines.add(recyler.removeLast());
//		repaint();
//	}
//	
//	// 3-3 畫 (視窗呈現的畫面) =>新的一頁如何呈現現在的資料
//	@Override // override => 把父類別拿來改善改良
//	protected void paintComponent(Graphics g) {
//		// TODO Auto-generated method stub
//		super.paintComponent(g);
//		
////		// 額外測試
////		if(g instanceof Graphics) {
////			System.out.println("OK");
////		}else {
////			System.out.println("XX");
////		}
//
////		// 額外測試
////		if(g instanceof Graphics2D) {
////			System.out.println("OK");
////		}else {
////			System.out.println("XX");
////		}
//		
//		// 3-3-1
//		Graphics2D g2d = (Graphics2D)g; // 設計線條=>類似小畫家的畫筆
//		
//		g2d.setColor(Color.BLUE); //畫筆顏色
//		g2d.setStroke(new BasicStroke(4)); // 畫筆粗細
//		
//		// 3-12 印出每一條線 for-each
////		for(LinkedList<HashMap<String, Integer>> line : lines) {
////			for(int i = 1; i < line.size(); i++){
////				HashMap<String, Integer> p0 = line.get(i-1);
////				HashMap<String, Integer> p1 = line.get(i);
////				g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y")); 
////			}
//		
//		for (LinkedList<Point> line : lines ) {
//			
//			for (int i=1; i<line.size(); i++) {
//				Point p0 =  line.get(i-1);
//				Point p1 =  line.get(i);
//				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
//			}
//		}
//		
//	}
//		
//		
//		// 3-10
////		for(int i = 1; i < line.size(); i++){
////			HashMap<String, Integer> p0 = line.get(i-1);
////			HashMap<String, Integer> p1 = line.get(i);
////			g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y")); 
////		}
//		
//		// 3-3-1
////		g2d.drawLine(0, 0, 200, 100); // 畫線條
//		
//	}
//	
//	// 3-4 與使用者互動，能夠偵測滑鼠的行為(位置)
//	private class MyListener extends MouseAdapter{ // 類別中的類別，因為方便存取外部類別的屬性跟方法
//
//		// 內部類別
//		@Override
//		public void mousePressed(MouseEvent e) { // 有{ }就有實作 // monsePressed 按一下滑鼠被觸發
//			// TODO Auto-generated method stub
//			// super.mousePressed(e);
//			
//			// 測試
////			System.out.println("Press");
//			
//			// 3-5-1 測試
////			System.out.println("Press:" + e.getX() + "*" + e.getY());
//			
//			// 3-8-1
////			HashMap<String, Integer> point = new HashMap<>();
////			point.put("x", e.getX()); point.put("y", e.getY());
//////			line.add(point);
////			
////			// 3-11-3
////			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
////			line.add(point);
////			lines.add(line);
//			
//			//-------------------------
//			
//			Point point = new Point();
//			point.x = e.getX(); point.y = e.getY();
//			LinkedList<Point> line = new LinkedList<>();
//			line.add(point);
//			
//			lines.add(line);
//			
//			recyler.clear();
//			
//		}
//		
//		@Override
//		public void mouseDragged(MouseEvent e) { // 有{ }就有實作
//			// TODO Auto-generated method stub
//			// super.mouseDragged(e);
//		
//			// 測試
////			System.out.println("Drag");
//			
//			//3-5-1 測試
////			System.out.println("Drag:"+ e.getX() + "*" + e.getY());
//			
//			// 3-8-2
////			HashMap<String, Integer> point = new HashMap<>();
////			point.put("x", e.getX()); point.put("y", e.getY());
////			line.add(point);
//			
//			// 3-11-4
////			lines.getLast().add(point);
//			
//			//--------------------
//			Point point = new Point();
//			point.x = e.getX(); point.y = e.getY();
//			lines.getLast().add(point);
//			
//			
//			// 3-9 呼叫repaint() 方法
//			repaint();
//			
//			}
//
//		private void repaint() {
//			// TODO Auto-generated method stub
//			
//		}
//	}
//	
//
//
////// 3-13-1 另一種寫法
////class Point{
////	public int x, y;
////}
////
////// 3-14 自動封箱
////class Line{
////	private LinkedList<Point> points;
////	private Color color;
////	private int Width;
////	
////	Line(){
////		points = new LinkedList<>();
////	}
////	void addPoint(Point point) {
////		points.add(point);
////	}
////	LinkedList<Point> getPoints(){
////		return points;
////	}
////}
