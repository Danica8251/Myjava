package tw.brad.myjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.myclass.MyDrawerAns;

public class MySignAns extends JFrame {
	private JButton clear, undo, redo, chColor, save, saveas, load;
	private MyDrawerAns myDrawer;
	
	public MySignAns() {
		super("簽名App");
		
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		chColor = new JButton("Color");
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear); top.add(undo); top.add(redo);
		top.add(chColor);
		
		add(top, BorderLayout.NORTH);
		
		myDrawer = new MyDrawerAns();
		add(myDrawer, BorderLayout.CENTER);
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setupListener();
	}
	
	private void setupListener() {
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		
		chColor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
	}
	
//	private void changeColor() {
//		Color newColor = JColorChooser.showDialog(null, "Line Color", MyDrawerAns.getNowColor());
//		myDrawer.setNowColor(newColor);
//	}
	
	private void changeColor() {
		Color newColor = new Color(0);
		myDrawer.setNowColor(newColor);
	}
	
	public static void main(String[] args) {
		new MySignAns();
	}

}