  
package View;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Hoksha
 */
public class AddIteamJDialog extends JDialog{
private JTextField itemNameTextField;
private JTextField itemCountTextField;
private JTextField itemPriceTextField;
private JLabel itemNameLabel;
private JLabel itemCountLabel;
private JLabel itemPriceLabel;
private JButton createNewIteamButton;
private JButton deleteIteamButton;

public AddIteamJDialog(ProjectJFrame frame) {
itemNameTextField = new JTextField(20);
itemNameLabel = new JLabel("Item Name");

itemCountTextField = new JTextField(20);
itemCountLabel = new JLabel("Item Count");

itemPriceTextField = new JTextField(20);
itemPriceLabel = new JLabel("Item Price");

createNewIteamButton = new JButton("Create New Order");
deleteIteamButton = new JButton("Cancel Order");

createNewIteamButton.setActionCommand("newSecondaryOrderRight");
deleteIteamButton.setActionCommand("cancelSecondaryOrderRight");

createNewIteamButton.addActionListener(frame.getdesignNew());
deleteIteamButton.addActionListener(frame.getdesignNew());
setLayout(new GridLayout(4, 2));

add(itemNameLabel);
add(itemNameTextField);
add(itemCountLabel);
add(itemCountTextField);
add(itemPriceLabel);
add(itemPriceTextField);
add(createNewIteamButton);
add(deleteIteamButton);

pack();
}

public JTextField getItemNameTextField() {
return itemNameTextField;
}

public JTextField getItemCountTextField() {
return itemCountTextField;
}

public JTextField getItemPriceTextField() {
return itemPriceTextField;
}
}
