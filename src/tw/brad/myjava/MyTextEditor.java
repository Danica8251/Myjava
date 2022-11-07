package tw.brad.myjava;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import tw.brad.myclass.TextEditor;

// 文字編輯器

public class MyTextEditor extends JFrame {
	private TextEditor textEditor;
	
	public MyTextEditor() {
		super("文字編輯器");
		
		setLayout(new BorderLayout());
		
		setSize(800,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	

	public static void main(String[] args) { 
	
	}

}

