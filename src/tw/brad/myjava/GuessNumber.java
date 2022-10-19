package tw.brad.myjava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame implements ActionListener{  // 此行叫做 對外宣告
//                                         實作
	
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter; // int是基本型別，所以不用初始化，就是初始值：0
	
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
		
		// Listener 傾聽者
		guess.addActionListener(this); // this 本人 ，因為只有一個按鈕，故只有寫一個listener
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		newRound(); // 畫面結束後，直接開新局
		
	}
	
	private String creatAnswer(int dig) { // int dig => 猜幾碼
		int nums =10;
		int[] poker = new int[nums];
		
		for (int i = 0; i < nums; i++) poker[i] = i;
		
		// 開始洗牌
		for (int i = nums - 1; i > 0; i--) {
//			System.out.println(i); // 驗算
			int rand = (int)(Math.random() * (i + 1)); // 0 ~ 9 共10個數字
		
			// poker[rand] <-> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
			
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<dig; i++) { // 猜幾(dig)碼
			sb.append(poker[i]);
		}
		
		return sb.toString();
		
	}
	
	
	
	public static void main(String[] args) {
		
		/* 在做專案時，先把主功能(核心功能)做到，然後再做其他附加功能 */
		
		new GuessNumber();
		
	}
	
	private void newRound() { // 開新局
		answer = creatAnswer(3);
		counter = 0; // 開新局要歸零
		log.setText("");
		
//		System.out.println(answer);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 有{ }就是有實作 // 按下去要做的事情
		// TODO Auto-generated method stub
		
//		// 驗證 code
//		System.out.println("OK");  //按下按鈕有被listener聽到了，就會輸出OK
//		System.out.println(creatAnswer(4)); // int dig = 4
				
		// 流程OK，然後再做後續
		counter++;
		String result = checkAB();
		log.append(counter + ". " + input.getText() + "：" + result + "\n"); // input是一個元件不是一個字串
		
		// 判斷
		if (result.equals("3A0B")) {  // result是字串，字串是物件，不能使用==，要用equals
			JOptionPane.showMessageDialog(null, "恭喜");
		}else if (counter == 10) {
			JOptionPane.showMessageDialog(null, "輸了，答案是" + answer);
		}
		
		input.setText("");
	}
		
/* 
	按下去要做的事情
	1.比對答案
 	2.
*/
	
/*
	private String checkAB() {
		int a, b; a = b = 0;
		for (int i=0; i<answer.length(); i++)){
			if (answer中的第i碼 == guess中的第i碼 ) {
				a++;
			}else if (guess中的第i碼 是否存在於 a 中) {
				b++;
			}
		}
		return String.format("%dA%dB",a, b );
	}
*/
	// 檢查 幾 A 幾 B
	private String checkAB() {
		int a, b; a = b = 0;
		String gString = input.getText();
		
		for (int i=0; i<answer.length(); i++){
			char ac = answer.charAt(i);
			char gc = gString.charAt(i);
			if ( ac == gc ) {
				a++;
			}else if (answer.indexOf(gc) >= 0) {
				b++;
			}
		}
		return String.format("%dA%dB",a, b );
	}
	
	
		

}
