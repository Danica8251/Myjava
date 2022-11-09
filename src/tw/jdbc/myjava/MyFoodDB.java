package tw.jdbc.myjava;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import tw.jdbc.myclass.MyFoodTable;

public class MyFoodDB extends JFrame {
	private MyFoodTable foodTable;

	public MyFoodDB() {
		super();

		// 1-2 邊框布局
		setLayout(new BorderLayout());

		// 1-3 表格位置 1-4設計內容要到MyFoodTable去設計
		try {
			foodTable = new MyFoodTable();
		} catch (Exception e) {
			System.out.println(e);
		}

		JScrollPane jsp = new JScrollPane(foodTable);
		add(jsp, BorderLayout.CENTER);

		// 1-1 視窗大小
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyFoodDB();
	}

}
