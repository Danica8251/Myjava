package tw.jdbc.myjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import tw.jdbc.myclass.MyFoodTable;

public class MyFoodDB extends JFrame {
	private MyFoodTable foodTable;
	private JButton del, add, test;

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

		JPanel top = new JPanel(new FlowLayout());
		del = new JButton("Del");
		add = new JButton("Add");
		test = new JButton("Test");
		top.add(del);
		top.add(add);
		top.add(test);

		add(top, BorderLayout.NORTH);

		// 1-1 視窗大小
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setListener();
	}

	private void setListener() {
		del.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				foodTable.delRow();
			}
		});
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				foodTable.addRow();
			}
		});

		test.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				foodTable.newsql();
			}
		});
	}

	public static void main(String[] args) {
		new MyFoodDB();
	}

}
