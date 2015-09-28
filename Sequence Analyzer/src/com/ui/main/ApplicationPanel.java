package com.ui.main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class ApplicationPanel extends JPanel {

	public ApplicationPanel()
	{
		super();
		//add(new JLabel("Hello"));
		//add(new JButton("Click"));
		//this.setBackground(Color.gray);
	}
	
	//Parameter applicationModule
	public void loadApplictaionModule(ApplicationModule module)
	{
		this.add(module);
	}
	
}
