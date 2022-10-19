package tw.brad.myjava;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame{

	private JButton guess;
	private JTextField input;
	private JTextArea log;
	
	public GuessNumber() {
		super("猜數字遊戲");
		
//		guess.setText("XXX"); // 若先寫這行，guess 還沒初始化，編譯通過但執行時會報錯(NullPoint)

		guess = new JButton("猜");
		input = new JTextField(); log = new JTextArea();
		
		setLayout(new BorderLayout()); // step1.大布局
		JPanel top = new JPanel(new BorderLayout()); // step2.上面欄位
		top.add(input, BorderLayout.CENTER); // step3.input放在上面中間
		top.add(guess,BorderLayout.EAST); // step4. guess放在上面右邊
		
		add(top,BorderLayout.NORTH); // step5. top 放在北邊
		add(log, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		
		/* 在做專案時，先把主功能(核心功能)做到，然後再做其他附加功能 */
		
		new GuessNumber();
		
	}

}
