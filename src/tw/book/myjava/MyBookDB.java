package tw.book.myjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import tw.book.myclass.MyBookTable;

//1. MyBookDB 繼承 JFrame
public class MyBookDB extends JFrame {
	// private 宣告類別
	private MyBookTable bookTable;
	private JButton del, add;

	public MyBookDB() {
		// 設定視窗標題
		super("電腦資訊近期新書");

		// 邊框布局
		setLayout(new BorderLayout());

		// 1-3 表格位置 1-4設計內容要到MyBookTable去設計
		try {
			bookTable = new MyBookTable();
		} catch (Exception e) {
			System.out.println(e); // 印出例外
		}

		//
		JScrollPane jsp = new JScrollPane(bookTable);
		add(jsp, BorderLayout.CENTER);

		//
		JPanel top = new JPanel(new FlowLayout());
		del = new JButton("Del");
		add = new JButton("Add");
		top.add(del);
		top.add(add);

		add(top, BorderLayout.NORTH);

		// 設定視窗大小
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//
		setListener();

	}

	//
	private void setListener() {
		del.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bookTable.delRow();
			}
		});

		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bookTable.addRow();
			}
		});
	}

	// 2.
	public static void main(String[] args) {
		new MyBookDB();
	}

}
