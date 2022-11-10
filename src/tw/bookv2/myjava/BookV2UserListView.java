package tw.bookv2.myjava;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/*
 * 查詢介面設計
 */

public class BookV2UserListView extends JFrame { // 繼承 JFrame

	private JPanel contenPane; // 邊框佈局
	private JTable table; // 表格
	private JTextField titleText; // 文字欄位

//	private BookV2Dao bookV2Dao = new BookV2Dao(); // 將操作成果傳回資料庫

	/*
	 * 啟動程式
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					BookV2UserListView frame = new BookV2UserListView(); // 視窗應用程式
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); // 印出例外
					System.out.println(e);
				}
			}
		});
	}

	/*
	 * 新增 Frame(視窗)
	 */
	public BookV2UserListView() {
		setTitle("近期電腦資訊新書"); // 視窗程式標題
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 關閉選項(右上角的叉叉圖示)按下後的動作=>EXIT_ON_CLOSE：點選關閉時，關閉程式
		setBounds(100, 100, 600, 337); // 決定各元件位置
		setLocationRelativeTo(null); // 窗口相對於指定元件的位置。如果元件為null，則此窗口將置於視窗的中央。

		contenPane = new JPanel();
		contenPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // 設定元件的大小
		setContentPane(contenPane);
		contenPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane(); // JScrollPane 帶滾動條的面板
		scrollPane.setBounds(10, 39, 564, 232);
		contenPane.add(scrollPane);

		Object[] columns = { "編號", "書名", "作者", "出版商", "出版日期" };
		Object[][] data = null; // 需要展示的資料
		DefaultTableModel model = new DefaultTableModel(data, columns); // DefaultTableModel 用來處存表格值
		table = new JTable(model);

		// 載入書籍資料
		load(null);
		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("書名");
		lblNewLabel.setBounds(10, 10, 42, 15);
		contenPane.add(lblNewLabel);

		titleText = new JTextField();
		titleText.setBounds(44, 8, 115, 21);
		contenPane.add(titleText);
		titleText.setColumns(10);

		// 查詢按鈕
		JButton searchBtn = new JButton("查詢");
		searchBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				load(titleText.getText());
			}
		});
		searchBtn.setBounds(169, 8, 63, 23);
		contenPane.add(searchBtn);

		// 新增按鈕
		JButton addBtn = new JButton("新增");
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AddView view = new AddView();
				view.setVisible(true);
			}
		});
		addBtn.setBounds(365, 8, 63, 23);
		contenPane.add(addBtn);

		// 修改按鈕
		JButton updateBtn = new JButton("修改");
		updateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 獲取選中 行位
				int row = table.getSelectedRow();
				if (row < 0) {
					JOptionPane.showMessageDialog(contenPane, "請選擇一筆資料", "系統提示", JOptionPane.WARNING_MESSAGE);
					return;
				}
				int id = Integer.valueOf(table.getValueAt(row, 0).toString());
				UpdateView view = new UpdateView(id);
				view.setVisible(true);
			}
		});
		updateBtn.setBounds(438, 8, 63, 23);

		// 刪除按鈕
		JButton delectBtn = new JButton("刪除");
		updateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 獲取選中 行位
				int row = table.getSelectedRow();
				if (row < 0) {
					JOptionPane.showMessageDialog(contenPane, "請選擇一筆資料", "系統提示", JOptionPane.WARNING_MESSAGE);
					return;
				}
				int result = JOptionPane.showConfirmDialog(contenPane, "確認刪除該筆資料嗎?", "提示", JOptionPane.YES_NO_OPTION);
				if (result == 0) {
					int id = Integer.valueOf(table.getValueAt(row, 0).toString());
					boolean flag = bookV2Dao.delete(id);
					if (flag) {
						JOptionPane.showMessageDialog(contenPane, "刪除成功!");
						load(null);
					} else {
						JOptionPane.showMessageDialog(contenPane, "操作失敗", "系統提示", JOptionPane.WARNING_MESSAGE);
					}
				}
				return;
			}
		});
		delectBtn.setBounds(511, 8, 63, 23);
		contenPane.add(delectBtn);
		contenPane.add(updateBtn);
	}

	// 填寫表格資料
	public void load(String title) {
		List<BookV2> list = BookV2Dao.queryList(title);
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		tableModel.setRowCount(0); // 清除原有行

		// 填寫資料
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		for (BookV2 item : list) {
			String[] arr = new String[6];
			arr[0] = item.getId() + "";
			arr[1] = item.getTitle();
			arr[2] = item.getAuthor();
			arr[3] = item.getPublisher();
			arr[4] = item.getDate(item.getDate());
			arr[5] = item.getBclass();

			// 添加資料到表格
			tableModel.addRow(arr);
		}
	}

}
