package com.ui.main;

import javax.swing.*;

public class ProteinIDListPanel extends JPanel {
	
	private JLabel lblProteinID;
	private JList lstProteinIDs;
	private JScrollPane proteinIDScrollPane;
	
	private String[] dummyIDs = {"ENSP00000373691", "ENSP000003732491", "ENSP0033373691" , "a" ,"b" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,"a" ,};
	
	public ProteinIDListPanel()
	{
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		initializeComponent();
	}
	private void initializeComponent()
	{
		lblProteinID = new JLabel("Protein IDs");
		lstProteinIDs = new JList();
		lstProteinIDs.setListData(dummyIDs);
		proteinIDScrollPane = new JScrollPane(lstProteinIDs);
		
		
		this.add(lblProteinID);
		this.add(proteinIDScrollPane);
	}
}
