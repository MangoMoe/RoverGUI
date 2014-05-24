package leftpanel;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class WestPanel extends JPanel {
	JLabel label;
	JTable armTable;
	TableModel armDataModel;
	
	public WestPanel(){
		
		label = new JLabel("Arm Data");
		armDataModel = new ArmTableModel();
		armTable = new JTable((TableModel) armDataModel);
		armTable.getColumnModel().getColumn(0).setWidth(300);
		armTable.getColumnModel().getColumn(1).setWidth(200);
		armTable.getColumnModel().getColumn(2).setWidth(200);
		//this.add(label);
		this.add(armTable);
	}
	
}
