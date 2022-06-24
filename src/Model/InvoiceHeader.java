
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
private int invoiceNumber;
private String customerName;
private Date invoiceDate;
private ArrayList<InvoiceLine> invLine;  

public InvoiceHeader(int invoiceNumber, String customerName, Date invoiceDate) {
this.invoiceNumber = invoiceNumber;
this.customerName = customerName;
this.invoiceDate = invoiceDate;

}

public Date getInvoiceDate() {
return invoiceDate;
}

public void setInvoiceDate(Date invoiceDate) {
this.invoiceDate = invoiceDate;
}

public int getInvoiceNumber() {
return invoiceNumber;
}

public void setInvoiceNumber(int invoiceNumber) {
this.invoiceNumber = invoiceNumber;
}

public String getCustomerName() {
return customerName;
}

public void setCustomerName(String customerName) {
this.customerName = customerName;
}

@Override
public String toString() {
String string = "InvoiceMain{" + "invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", invoiceDate=" + invoiceDate + '}';
for (InvoiceLine secondary : getInvLine()) {
string += "\n\t" + secondary;
}
return string;
}

public ArrayList<InvoiceLine> getInvLine() {
if (invLine == null)
invLine = new ArrayList<>();  
return invLine;
}

public void setSecondary(ArrayList<InvoiceLine> invLine) {
this.invLine = invLine;
}

public double getInvoiceTotal() {
double total = 0.0;
for (InvoiceLine secondary : getInvLine()) {
total += secondary.getSecondaryTotal();
}
return total;
}

public void addInvoiceSecondary(InvoiceLine invLine) {
getInvLine().add(invLine);
}

public String getInformationsCSV() {
DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
return "" + getInvoiceNumber() + "," + dateformat.format(getInvoiceDate()) + "," + getCustomerName();
}

}
