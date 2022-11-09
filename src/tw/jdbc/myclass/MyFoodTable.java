package tw.jdbc.myclass;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyFoodTable extends JTable {
	private MyTableModel tableModel;
	private FoodDB foodDB;

	public MyFoodTable() throws Exception { // 拋出例外

		foodDB = new FoodDB();
		foodDB.queryData("SELECT * FROM food");

		tableModel = new MyTableModel();
		setModel(tableModel);
		tableModel.setColumnIdentifiers(foodDB.getHeader());

	}

	private class MyTableModel extends DefaultTableModel {

		// 右鍵=>Source=>Override/....

		@Override
		public int getRowCount() {
			return foodDB.getRows();
		}

		@Override
		public int getColumnCount() {
			return foodDB.getCols();
		}

		@Override
		public Object getValueAt(int row, int column) {
			return "Brad " + row + "x" + column;
		}

	}

}
