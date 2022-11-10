package tw.book.myclass;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/* MyBookTable 繼承 JTable */
public class MyBookTable extends JTable {
	/* private 宣告 */
	private MyBookModel tableModel;
	private BookDB bookDB;

	/* 拋出例外 */
	public MyBookTable() throws Exception {
		bookDB = new BookDB(); // 在bookDB類別中建構新的物件
		bookDB.queryData("SELECT * FROM library");

		tableModel = new MyBookModel();
		setModel(tableModel);
		tableModel.setColumnIdentifiers(bookDB.getHeader());

	}

	/**/
	public void delRow() {
		tableModel.removeRow(getSelectedRow());
		repaint();
	}

	/**/
	public void addRow() {
		tableModel.addRow(new String[2]);
		repaint();
		scrollRectToVisible(getCellRect(bookDB.getRows() + 1, 0, false));
	}

	/* 宣告newsql */
	public void newsql() {
		try {
			bookDB.queryData("SELECT id, title FROM library ORDER BY title ");
			tableModel.setColumnIdentifiers(bookDB.getHeader());
			repaint();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/* 宣告 MyBookModel 類別並繼承DefaultTableModel */
	private class MyBookModel extends DefaultTableModel {

		@Override
		public int getRowCount() {
			return bookDB.getRows();
		}

		@Override
		public int getColumnCount() {
			return bookDB.getCols();
		}

		@Override
		public Object getValueAt(int row, int column) {
			return bookDB.getData(row + 1, column + 1);
		}

		@Override
		public void setValueAt(Object aValue, int row, int column) {
			bookDB.setData(row + 1, column + 1, (String) aValue);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return column > 0;
		}

		@Override
		public void removeRow(int row) {
			bookDB.delData(row + 1);
		}

		@Override
		public void addRow(Object[] rowData) {
			bookDB.addData();
		}

	}

}
