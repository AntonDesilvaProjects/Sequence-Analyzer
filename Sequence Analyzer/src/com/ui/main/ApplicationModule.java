package com.ui.main;

import javax.swing.*;

public class ApplicationModule extends JPanel {
	
	private String moduleDescription;
	
	public ApplicationModule()
	{
		super();
	}
	
	public String getModuleDescription()
	{
		return moduleDescription;
	}
	public void setModuleDescription(String value)
	{
		moduleDescription = value;
	}
}
