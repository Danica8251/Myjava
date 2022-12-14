///*
// * 簽名程式
// * Brad01 - 42 總複習
// * */
//
//package tw.brad.myjava;
//
//import java.awt.*;
//import java.awt.event.*;
//
//import javax.swing.*;
//
//import tw.brad.myclass.MyDrawer;
//
//public class MySign extends JFrame {
//	
//	private JButton clear, undo, redo, save, saveas, load; // 2-1 先key此行再key下面
//	private JPanel myDrawer; // 3-1 先key此行再key下面
//	
//	public MySign() {
//		super("簽名App");
//		
//		// 2.視窗版面配置
//		setLayout(new BorderLayout());
//		
//		// 2-1. 設計按鈕
//		clear = new JButton("Clear");
//		undo = new JButton("Undo");
//		redo = new JButton("Redo");
//		
//		// 2-2.配置按鈕位置
//		JPanel top = new JPanel(new FlowLayout());
//		top.add(clear); top.add(undo); top.add(redo);
//		
//		add(top, BorderLayout.NORTH);
//		
//		// 3. 至package tw.brad.myclass 新增 MyDrawer 新類別
//		
//		// 3-1
//		myDrawer = new MyDrawer();
//		add(myDrawer, BorderLayout.CENTER);
//		
//		
//		// 1.視窗
//		setSize(800,480);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		
//		// 3-16-2
//		setupListenter();
//	}
//	
//	// 3-16-1
//	private void setupListenter() {
//		clear.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				myDrawer.clear();
//			}
//		});
//		
//		undo.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				myDrawer.undo();
//			}
//		});
//		
//		redo.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				myDrawer.redo();
//			}
//		});
//	}
//	
//
//
//	public static void main(String[] args) {
//		new MySign();
//	}
//
//}
