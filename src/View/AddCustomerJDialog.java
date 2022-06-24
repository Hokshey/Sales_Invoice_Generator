
package View;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class AddCustomerJDialog extends JDialog {
private JTextField customerNameTextField;
private JTextField invoiceDateTextField;
private JLabel customerNameLabel;
private JLabel invoiceDateLabel;
private JButton createNewICustomerBtn;
private JButton deleteCustomerBtn;

public AddCustomerJDialog(ProjectJFrame frame) {
customerNameLabel = new JLabel("Customer Name:");
customerNameTextField = new JTextField(20);
invoiceDateLabel = new JLabel("Invoice Date:");
invoiceDateTextField = new JTextField(20);
createNewICustomerBtn = new JButton("Create New Order");
deleteCustomerBtn = new JButton("Cancel Order");

createNewICustomerBtn.setActionCommand("newMainOrderLeft");
deleteCustomerBtn.setActionCommand("cancelMainOrderLeft");

createNewICustomerBtn.addActionListener(frame.getdesignNew());
deleteCustomerBtn.addActionListener(frame.getdesignNew());
setLayout(new GridLayout(3, 2));

add(invoiceDateLabel);
add(invoiceDateTextField);
add(customerNameLabel);
add(customerNameTextField);
add(createNewICustomerBtn);
add(deleteCustomerBtn);

pack();

}

public JTextField getCustomerNameTextField() {
return customerNameTextField;
}

public JTextField getInvoiceDateTextField() {
return invoiceDateTextField;
}

}
