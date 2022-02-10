package com.workouts.corejava;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PhoneDirectory extends JFrame {

	static List<String> nameList;
	private JLabel contactLabel;
	private JTextField contactField;
	
	private JTextArea contactListDisplay;
	private JTextArea contactList;

	static {
		nameList = Arrays.asList("Pravin", "Dheep", "Test", "Phone");
	}

	PhoneDirectory() {
		super();
	}

	public void initialize() {
		JFrame frame = new JFrame();
		JPanel phonePanel = new JPanel();

		phonePanel.setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 1;
		gc.gridy = 1;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.insets = new Insets(50,50,10, 10);
		gc.fill = GridBagConstraints.NONE;

		contactLabel = new JLabel("Contact :");
		contactLabel.setMinimumSize(new Dimension(150,25));
		phonePanel.add(contactLabel, gc);

		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		gc.gridx = 2;
		gc.gridy = 1;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.insets = new Insets(50,70, 10, 10);
		gc.fill = GridBagConstraints.NONE;

		contactField = new JTextField(30);
		contactField.setMinimumSize(new Dimension(250,20));
		phonePanel.add(contactField, gc);

		gc.anchor = GridBagConstraints.LAST_LINE_START;
		gc.gridx = 3;
		gc.gridy = 1;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.fill = GridBagConstraints.NONE;

		contactListDisplay = new JTextArea(200, 300);
		for (String name : nameList) {
			contactListDisplay.append(name + "\n");
			contactListDisplay.revalidate();
		}
		contactListDisplay.setMinimumSize(new Dimension(200,300));
		contactListDisplay.setEnabled(false);
		phonePanel.add(contactListDisplay, gc);
		
		gc.anchor = GridBagConstraints.LAST_LINE_END;
		gc.gridx = 4;
		gc.gridy = 1;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.fill = GridBagConstraints.NONE;

		contactList = new JTextArea(200, 300);
		for (String name : nameList) {
			contactList.append(name + "\n");
			contactList.revalidate();
		}
		contactList.setMinimumSize(new Dimension(200,300));
		phonePanel.add(contactList, gc);
 
		contactField.addKeyListener(new ContactKeyListener());
 
		frame.add(phonePanel);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}

	public class ContactKeyListener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			JTextField contactSearch = (JTextField) e.getSource();
			for (String name : nameList) {
				if (name.equalsIgnoreCase(contactSearch.getText())) {
					contactList.setText(name+"\n");
				}
			}
		}

	}

	public static void main(String[] args) {
		PhoneDirectory pd = new PhoneDirectory();
		pd.initialize();
	}
}
