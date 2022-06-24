
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hoksha
 */
public class IteamTable extends AbstractTableModel {

private List<InvoiceLine> invoiceLine;
private DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");

public IteamTable(List<InvoiceLine> invoiceLine) {
this.invoiceLine = invoiceLine;
}

public List<InvoiceLine> getInvoiceLine() {
return invoiceLine;
}


@Override
public int getRowCount() {
return invoiceLine.size();
}

@Override
public int getColumnCount() {
return 4;
}

@Override
public String getColumnName(int columnIndex) {
switch (columnIndex) {
case 0:
return "Item Name";
case 1:
return "Item Price";
case 2:
return "Count";
case 3:
return "Item Total";
default:
return "";
}
}

@Override
public Class<?> getColumnClass(int columnIndex) {
switch (columnIndex) {
case 0:
return String.class;
case 1:
return Double.class;
case 2:
return Integer.class;
case 3:
return Double.class;
default:
return Object.class;
}
}

@Override
public boolean isCellEditable(int rowIndex, int columnIndex) {
return false;
}

@Override
public Object getValueAt(int rowIndex, int columnIndex) {
InvoiceLine row = invoiceLine.get(rowIndex);

switch (columnIndex) {
case 0:
return row.getItemName();
case 1:
return row.getItemPrice();
case 2:
return row.getItemCount();
case 3:
return row.getSecondaryTotal();
default:
return "";
}

}

}
