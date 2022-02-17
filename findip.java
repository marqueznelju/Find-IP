import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class findip extends JFrame implements ActionListener {
	JLabel label;
	JTextField text_field;
	JButton button;

findip() {
	super("Find IP address");
	label = new JLabel("Enter URL:");
	label.setBounds(70,90,250,40);
        text_field = new JTextField();
        text_field.setBounds(50,100,200,20);

        button = new JButton("Find it!");
        button.setBounds(50,50,100,40);
        button.addActionListener(this); // Set an action for finding ip address.
        add(label);
        add(text_field);
        add(button);
        setSize(600,400);
        setLayout(null);
        setVisible(true); // Make it visible the GUI.
}
	
public void actionPerformed(ActionEvent e) {
	String url = text_field.getText(); // Get an input from URL.

	// Getting an address.
        try {
		InetAddress ia=InetAddress.getByName(url);
	        String ip=ia.getHostAddress();  
	        JOptionPane.showMessageDialog(this,ip);
	}catch (UnknownHostException e1) {
		JOptionPane.showMessageDialog(this,e1.toString());
	}
}
public static void main(String[] args) {  
	new findip();
}  
}
